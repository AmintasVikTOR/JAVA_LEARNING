package com.company.pckg_list;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


public class MainList {
public static String myString="";
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("C://myfile//taskList.txt", false);

        myString="Let's start!";

        writer.write(myString);
        writer.append('\n');
        writer.flush();

        Scanner input = new Scanner(System.in);
        System.out.println("Input size..");
        int size = input.nextInt();

        //MyArrayList(size, writer);
        //MyLinkedList(size,writer);
        MyPassport (size,writer);

      }

    public static void MyPassport (int cnt, FileWriter writer) throws IOException {
        List<Passport> collection=new ArrayList<>();
        Passport pass=new Passport();
        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String s1="";

        int a = (int)(( Math.random() * (9999999 - 1000000 + 1) + 1000000));
        int rand_year = 2019;
        int rand_month = 12;
        int rand_day = 12;

        writer.write("Count elements: "+cnt);
        writer.append('\n');

        for (int i=0;i<cnt;i++) {
            s1="";
            a = (int)(( Math.random() * (9999999 - 1000000 + 1) + 1000000));
            rand_year = (int)((Math.random() * (2019 - 2000 + 1) + 2000));
            rand_month = (int)((Math.random() * (12 - 1 + 1) + 1));
            rand_day = (int)((Math.random() * (28 - 1 + 1) + 1));
            pass.setId("МР"+a);
            pass.setDatePasport(new Date( rand_year +"/"+rand_month+"/"+rand_day));
            pass.setFio("Иванов Иван Иванович");
            collection.add(pass);
            s1= pass.getId() + "__" + dateFormat.format(pass.getDatePasport()) + "__"+pass.getFio()+"_ADDED!";
            //s1= pass.getId() + "__" + String.format("e;EEE, MMM d, ''yy\"e",pass.getDatePasport())+ "__"+pass.getFio()+"_ADDED!";
            writer.write(s1);
            writer.append('\n');
        }
        long time2 = System.currentTimeMillis();
        float time3=(float) (time2-time)/1000;

        myString="";
        myString="Time add..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');
        writer.flush();
        s1="";
        writer.flush();
        writer.write("REMOVE-OPERATION!!!!");
        writer.append('\n');

       //collection.removeAll(collection);

        time = System.currentTimeMillis();
        for (int i=collection.size()-1; i>0;i--) {
            collection.remove(i);
            s1="Element" + i+" was removed!";
            writer.write(s1);
            writer.append('\n');
          }
        time2 = System.currentTimeMillis();
        time3=(float) (time2-time)/1000;
        myString="";
        myString="Time removed..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');
        writer.append('\n');
        writer.flush();

    }

    public static void MyArrayList (int cnt, FileWriter writer) throws IOException {
        ArrayList <String> AL=new ArrayList<>();
        long time = System.currentTimeMillis();

        myString="";
        myString="ArrayList INFO. Count elements: "+cnt;
        writer.write(myString);
        writer.append('\n');
        writer.flush();

        System.out.println(myString);

        String s1;
        for (int i=0;i<cnt;i++) {
            s1="Element" + i;
            AL.add(s1);
            writer.write(s1);
            writer.append('\n');
        }
        writer.flush();
        long time2 = System.currentTimeMillis();

        //long time3=(time2-time)/1000;
        float time3=(float) (time2-time)/1000;

        myString="";
        myString="Time add..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');

        s1="";
        time = System.currentTimeMillis();
        for (int i =0; i<AL.size();i++) {
            AL.remove(i);
            s1="Element" + i+" was removed!";
            AL.add(s1);
            writer.write(s1);
            writer.append('\n');
        }
        writer.flush();
        time2 = System.currentTimeMillis();
        time3=(float) (time2-time)/1000;
        myString="";
        myString="Time removed..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');
        writer.append('\n');
        writer.flush();
    }

    public static void MyLinkedList (int cnt, FileWriter writer) throws IOException {
        LinkedList <String> AL=new LinkedList<>();
        long time = System.currentTimeMillis();

        myString="";
        myString="LinkedList INFO. Count elements: "+cnt;
        writer.write(myString);
        writer.append('\n');
        writer.flush();

        System.out.println(myString);
        for (int i=0;i<cnt;i++)
            AL.add("Element"+i);
        long time2 = System.currentTimeMillis();

        //long time3=(time2-time)/1000;
        float time3=(float) (time2-time)/1000;
        myString="";
        myString="Time add..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');
        System.out.println(myString);

        time = System.currentTimeMillis();
        for (int i =0; i<AL.size();i++) {
            AL.remove(i);
        }
        time2 = System.currentTimeMillis();
        time3=(float) (time2-time)/1000;

        myString="";
        myString="Time removed..="+time3+" sec.";
        System.out.println(myString);
        writer.write(myString);
        writer.append('\n');
        writer.append('\n');
        writer.flush();
    }
}
