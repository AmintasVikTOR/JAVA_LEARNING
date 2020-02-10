package com.company.pckg_test.test1;

public class MainTest {
    public static void main(String[] args) {

        int a=2, c=4;
        //int b=a+++(-a*++a);
        int b=-c + ++c;
        //int b=a++;
        //int c=a++ * (++a + --a);
        System.out.println(b);

    }
}
