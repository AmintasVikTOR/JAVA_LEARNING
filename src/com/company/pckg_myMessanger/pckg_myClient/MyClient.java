package com.company.pckg_myMessanger.pckg_myClient;

import com.company.pckg_myMessanger.pckg_myNetwork.INetwork;
import com.company.pckg_myMessanger.pckg_myNetwork.MyNetwork;
import com.company.pckg_test.mywindow.MyWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyClient extends JFrame implements ActionListener, INetwork {

    private static final String IP_ADDR = "192.168.33.118";
    private static final int PORT=8189;
    private static final int WIDTH=1024;
    private static final int HEIGHT=768;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyClient();
            }
        });

    }

    private final JTextArea log=new JTextArea();
    private final JTextField fieldNickName=new JTextField("Amintas");
    private final JTextField fieldInput=new JTextField();

    private MyNetwork tcpConnection;

    private MyClient (){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        log.setEditable(false);
        log.setLineWrap(true);

        fieldInput.addActionListener(this);

        add(log, BorderLayout.CENTER);
        add(fieldInput, BorderLayout.SOUTH);
        add(fieldNickName, BorderLayout.NORTH);

        setVisible(true);

        try {
            tcpConnection=new MyNetwork(this, IP_ADDR, PORT);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String msg=fieldInput.getText();
        if (msg.equals("")) return;
        fieldInput.setText(null);
        tcpConnection.sendString(fieldNickName.getText()+": "+msg);

    }

    @Override
    public void onConnectionReady(MyNetwork tcpConnection) {
        printMsg("Connection ready...");
    }

    @Override
    public void onReceiveString(MyNetwork tcpConnection, String value) {
        printMsg(value);

    }

    @Override
    public void onDisconnect(MyNetwork tcpConnection) {
        printMsg("Connection close...");
    }

    @Override
    public void onException(MyNetwork tcpConnection, Exception e) {
        printMsg("Connection exception: "+e);

    }

    private synchronized void printMsg (String value){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                log.append(value+"\n");
                log.setCaretPosition(log.getDocument().getLength());
            }
        });
    }
}
