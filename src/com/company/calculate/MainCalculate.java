package com.company.calculate;

import java.text.DecimalFormat;

public class MainCalculate {
    public static void main(String[] args) {
        DecimalFormat df1=new DecimalFormat("##.###");

        COperations res1=new COperations();

        System.out.println(df1.format(res1.mult(22.3,33.22)));
        System.out.println(df1.format(res1.divide(10.55,2.11)));
        System.out.println(df1.format(res1.sum(100.2,50.5)));
        System.out.println(df1.format(res1.minus(5.3,10.2)));

    }
}
