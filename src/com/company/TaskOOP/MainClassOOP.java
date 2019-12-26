package com.company.TaskOOP;
import com.company.pckg_Country.EnCountry;
import com.company.pckg_Country.Test;
import com.sun.deploy.security.SelectableSecurityManager;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

public class MainClassOOP {
    public static void main(String[] args) {

        EnCountry [] array = EnCountry.values();



        for (int i=0;i<array.length;i++){
            array[i].add_info((double)Math.random()*99999 ,(int) ((double) Math.random()*100000000));
        }

        for (int i=0;i<array.length;i++)
            array[i].print();

        EnCountry ccc=EnCountry.valueOf("France");

        for (int i=0;i<array.length;i++)
            if (array[i].toString()==ccc.toString())
                System.out.println("Tested string is '"+ccc.toString()+"'. I'm HAPPY!!!");


//        for (EnCountry s:array)
//            System.out.println("Element: "+s);
/*
        EnCountry cntrBY= EnCountry.Belarus;
        EnCountry cntrRUS= EnCountry.Russia;
        EnCountry cntrCH= EnCountry.China;
        EnCountry cntrCAN= EnCountry.Canada;
        EnCountry cntrEG= EnCountry.Egypt;
        EnCountry cntrFr= EnCountry.France;
        EnCountry cntrPOL= EnCountry.Poland;
        EnCountry cntrUSA= EnCountry.USA;
        EnCountry cntrAUS= EnCountry.Australia;
        EnCountry cntrIND= EnCountry.India;

        cntrBY.add_info(111.1,11);
        cntrRUS.add_info(222.2,22);
        cntrCH.add_info(3333.33,1000000);
        cntrCAN.add_info(4444.33,10000);
        cntrEG.add_info(5555.33,122233);
        cntrFr.add_info(66666.55,2222233);
        cntrPOL.add_info(77777.6,323223);
        cntrUSA.add_info(8888.888,888000);
        cntrAUS.add_info(999999.99,90000);
        cntrIND.add_info(100000.99,100000);

        cntrBY.print();
        cntrRUS.print();
        cntrCH.print();
        cntrCAN.print();
        cntrEG.print();
        cntrFr.print();
        cntrPOL.print();
        cntrUSA.print();
        cntrAUS.print();
        cntrIND.print();
*/



        //System.out.println("I'm hear!!!");
//        Test t1= new Test(1.22,5);
  //      t1.add_info();

    }
}

