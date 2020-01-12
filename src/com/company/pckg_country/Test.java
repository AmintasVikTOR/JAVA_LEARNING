package com.company.pckg_country;

public class Test /*implements Iadd_info*/ {

    Double sq;
    int cnt;

        public Test(double v, int i) {
            this.sq=v;
            this.cnt=i;
        }


        public void add_info (double v, int i) {
            System.out.println("Плош: "+v+", Кол-во: "+i);
        }




}
