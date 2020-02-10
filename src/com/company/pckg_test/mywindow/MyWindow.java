package com.company.pckg_test.mywindow;

import javax.swing.*;

public class MyWindow  extends JFrame {
    private static final String ipAdress = "88.99.44.251";
    private static final int portNumber = 1999;
    private static final int WIDTH = 600;
    private static final int HEIGTH = 400;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyWindow();
            }
        });

    }

    private MyWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGTH);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }
}