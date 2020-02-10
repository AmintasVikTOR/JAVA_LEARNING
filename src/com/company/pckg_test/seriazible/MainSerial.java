package com.company.pckg_test.seriazible;

import java.io.*;

public class MainSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject obj=new DataObject();
        obj.setMyData("hahahahahaha");

        File file=new File ("c:\\1\\store2.bin");

        FileOutputStream fo=new FileOutputStream(file);
        ObjectOutputStream so=new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();

        FileInputStream fi=new FileInputStream(file);
        ObjectInputStream si=new ObjectInputStream(fi);
        DataObject objNew=(DataObject) si.readObject();
        si.close();
        System.out.println(objNew);

    }
}
