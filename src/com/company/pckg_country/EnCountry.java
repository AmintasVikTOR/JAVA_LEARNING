package com.company.pckg_country;
import java.text.DecimalFormat;

public enum EnCountry implements Iadd_info, Comparable<EnCountry> {
    Belarus {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }

    },
    Russia {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    China {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Egypt {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Poland {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Australia {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    USA {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Canada {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    India {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    France {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    }
    ;

    String s1;
    Double sq;
    int cnt;
    // String name;

    public void print() {
        this.sq=sq;
        this.cnt=cnt;
        DecimalFormat df1=new DecimalFormat("##.###");
        System.out.print(valueOf(name())+". ");

        System.out.println("Площадь:"+df1.format(sq) +"; Количество: "+cnt);
    }
    @Override
    public void add_info2(String s1, Double sq, int cnt) {
        this.s1=s1;
        this.sq=sq;
        this.cnt=cnt;
    }

//    EnCountry() {
//        this.sq=sq;
//    }
//    public double getSq(){
//        return sq;
//    }


   /* public EnCountry(String name, double sq, int cnt){
        this.name=name;
        this.sq=sq;
        this.cnt=cnt;
    }*/

//    public int get_info_counts (int cnt)
//    {
//        return this.cnt=cnt;
//    }


//    EnCountry (double sq){
//        this.sq=sq;
//    }
//
//    Double getSquare(){
//        return sq;
//    }
//    @Override
//    public int compareTo (EnCountry ee){
//        return sq.compareTo(ee.getSquare());
//    }


}
