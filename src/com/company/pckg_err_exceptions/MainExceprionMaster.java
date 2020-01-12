package com.company.pckg_err_exceptions;

import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class MainExceprionMaster {
    public static void main(String[] args) {
        //System.out.println("Here exceptions!!");

        /*
        Scanner scanner = new Scanner(System.in);


        Integer s = null;
        do {
            System.out.println("Введите пожалуйста цифры");
            try {
                s = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Нужно ввести только цифры");
            }
        } while (s == null);*/

        //task2: числа, больше нуля
        FirstExceprion ex1=new FirstExceprion();
        try {
            System.out.println(ex1.myExceptionFirst(0));
        }
        catch (FirstExceprion eee)
        {
            System.out.println(eee.getMessage());
        }
        /////////////////////

        SecondException ex2=new SecondException();
        try {
            System.out.println(ex2.myExceptionFirst(-1));
        }
        catch (SecondException eee)
        {
            System.out.println(eee.getMessage());
        }


    }
}
