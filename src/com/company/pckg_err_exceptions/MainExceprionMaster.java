package com.company.pckg_err_exceptions;

import java.io.IOException;
import java.net.SocketException;
import java.util.Scanner;

public class MainExceprionMaster {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        SecondException ex_size=new SecondException();

        int size=0;
        System.out.println("Array size, please!");
        try {
            size = Integer.valueOf(scanner.nextLine());
            ex_size.arraySize(size);
        }
        catch (SecondException e2){
            System.out.println(e2.getMessage());
        }
        catch (NumberFormatException nn)
        {
            //System.out.println("Необходимо ввести число!");
            System.out.println(new SecondException("Введены некорректные данные"));
        }

        int cntErrors=0;
        int [] array = new int[size];
        for (int i=0; i<size;i++){
            System.out.println("Input element...");
            array[i]=Integer.valueOf(scanner.nextLine());
        }
        for (int a:array
             ) {
            System.out.println(a);

        }



        /*do {
            System.out.println("Введите пожалуйста цифры");
            try {
                s = Integer.valueOf(scanner.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Нужно ввести только цифры");
            }
        } while (s == null);
         */

       // System.out.println("Вы ввели " + s);

        //task2: числа, больше нуля
       /* FirstExceprion ex1=new FirstExceprion();
        try {
            System.out.println(ex1.myExceptionFirst(0));
        }
        catch (FirstExceprion eee)
        {
            System.out.println(eee.getMessage());
            System.out.println(eee.getCause());
        }


        SecondException ex2=new SecondException();
        try {
            System.out.println(ex2.myExceptionFirst(-1));
        }
        catch (SecondException eee)
        {
            System.out.println(eee.getMessage());
        }*/


    }
}
