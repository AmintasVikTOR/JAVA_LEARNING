package com.company.pckg_taskOOP;

import com.company.pckg_country.Class_info;

import java.util.TreeSet;

public class MainClassOOP_TEST {
    public static void main(String[] args) {
        TreeSet<Class_info> myList=new TreeSet<Class_info>();

        Class_info x1=new Class_info("Belarus", 55.22, 1000);
        Class_info x2=new Class_info("Russia", 22.222, 500000);
        Class_info x3=new Class_info("USA", 33.3333, 30000);

        myList.add(x1);
        myList.add(x2);
        myList.add(x3);

        /*
        for (Class_info c:myList){
            System.out.println(c);
        }
*/
        //for (int i=0;i<myList.size();i++)
        //{
        System.out.println(myList.toString());
        //}
    }
}
