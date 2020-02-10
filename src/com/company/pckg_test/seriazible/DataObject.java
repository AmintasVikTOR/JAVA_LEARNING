package com.company.pckg_test.seriazible;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject extends NonSeriazible implements Serializable
{
    private int i;
    private String s;
    private transient String [] def;

    // последовательность! как записываем, так и считываем
    private void writeObject (ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getMyData());
    }

    private void readObject (ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.readObject();
    }

}
