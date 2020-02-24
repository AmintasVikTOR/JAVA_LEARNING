package com.company.pckg_myMessanger.pckg_myServer;

import com.company.pckg_myMessanger.pckg_myNetwork.INetwork;
import com.company.pckg_myMessanger.pckg_myNetwork.MyNetwork;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

public class MyServer implements INetwork {
    public static void main(String[] args) {
        //может принимать вход соединения. может держать неск соединений. может принимать сообщения
        // для взаимодействия с сетью в джаве есть 2 класса: сервер сокет (слушает, принимает и т.п.) и сокет (установка соединения)
        new MyServer();
    }

    //список подключений
    private final ArrayList<MyNetwork> connections=new ArrayList<>();

    private MyServer (){
        System.out.println("Server running...");
        //слушать порт и принимать соединения
        //try с ресурсами, которая может закрывать ресурсы, которые захвачены
        try (ServerSocket serverSocket=new ServerSocket(8189)) {
            //на каждое новое соедиенине создаем новое (бесконечно)
            while (1==1){
                try {
                    new MyNetwork(this, serverSocket.accept());
                }
                catch (IOException e){
                    System.out.println("TCPConnection error-exception: "+e);
                }
            }

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //т.к. планируется подключение множества клиентов, нужно синхронизировать, чтобы нельзя было из разных потоков попасть в один и тот же метод,
    //т.к. может нарушить их работу
    @Override
    public synchronized void onConnectionReady(MyNetwork tcpConnection) {
        connections.add(tcpConnection);
        sendToAllConnections("Client connected: "+tcpConnection);
    }

    //если приняли строчку, нужно разослать всем клиентам
    @Override
    public synchronized void onReceiveString(MyNetwork tcpConnection, String value) {
        sendToAllConnections(value);

    }

    @Override
    public synchronized void onDisconnect(MyNetwork tcpConnection) {
        connections.remove(tcpConnection);
        sendToAllConnections("Client disconnected: "+tcpConnection);
    }

    @Override
    public synchronized void onException(MyNetwork tcpConnection, Exception e) {
        System.out.println("Что-то пошло не так..."+e);

    }

    private void sendToAllConnections (String value){
        System.out.println(value);
        final int cnt=connections.size();
        for (int i=0;i<cnt;i++){
            connections.get(i).sendString(value);
        }
    }
}
