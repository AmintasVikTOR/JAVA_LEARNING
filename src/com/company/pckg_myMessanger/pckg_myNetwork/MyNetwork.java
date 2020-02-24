package com.company.pckg_myMessanger.pckg_myNetwork;

import sun.rmi.transport.tcp.TCPConnection;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

//соединение...
// это будет наше одно соединение-TCP
// д.б. сокет, поток (на каждом клиенте), чтение, запись
public class MyNetwork {
    private final Socket socket;
    private final Thread rxThread;
    private final BufferedReader in;
    private final BufferedWriter out;
    private final INetwork evenListener;

    //конструкторы
    // на вход принимает готовое Объект сокета и с этим сокетом создает соединение
    //1: кто-то снаружи сделает соединение (создаст сокет)...
    public MyNetwork (INetwork evenListener, Socket socket) throws IOException {
        this.socket=socket;
        this.evenListener=evenListener;
        in= new BufferedReader(new InputStreamReader( socket.getInputStream(), Charset.forName("UTF-8")));
        out=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),Charset.forName("UTF-8")));
        rxThread=new Thread(new Runnable() {
            @Override
            public void run() {
                //слушаем входящее соединение
                try {
                    evenListener.onConnectionReady(MyNetwork.this);
                    while (!rxThread.isInterrupted()){
                        String msg=in.readLine();
                        evenListener.onReceiveString(MyNetwork.this, msg);
                    }

                } catch (IOException e) {
                    evenListener.onException(MyNetwork.this, e);
                }
                finally {
                    evenListener.onDisconnect(MyNetwork.this);
                }
            }
        });
        rxThread.start();
    }

    //2: сокет будет создаваться внутри
    public MyNetwork (INetwork evenListener, String ipAddress, int port) throws IOException {
        this (evenListener, new Socket(ipAddress, port));
    }


    //отправить сообщение
    //дисконнект
    //для потокобезопасности их нужно синхронизировать
    public synchronized void sendString (String value){
        try {
            out.write(value+"\r\n");
            out.flush();//передать строчку по сети
        } catch (IOException e) {
            evenListener.onException(MyNetwork.this, e);
            disconnect();
        }

    }
    public synchronized void disconnect(){
        rxThread.interrupt();//прерываем поток
        try {
            socket.close();
        } catch (IOException e) {
            evenListener.onException(MyNetwork.this, e);
        }

    }

    //полиморфизм) пишем оверрайд, метод и свою реализацию...
    @Override
    public String toString() {
        return "TCPConnection: "+socket.getInetAddress()+": "+socket.getPort();
    }
}
