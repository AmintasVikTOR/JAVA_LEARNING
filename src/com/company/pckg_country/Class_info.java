package com.company.pckg_country;

public class Class_info implements Iadd_info, Comparable<Class_info> {
    String s1;
    Double sq;
    int cnt;

    @Override
    public void add_info(Double sq, int cnt) {
        this.sq = sq;
        this.cnt=cnt;
    }

    @Override
    public void add_info2(String s1, Double sq, int cnt) {
        this.s1=s1;
        this.sq = sq;
        this.cnt=cnt;
    }
    @Override
    public String toString(){
        final StringBuffer bb = new StringBuffer("Country{");
        bb.append("").append(s1);
        bb.append(";SQUARE=").append(sq);
        bb.append(", Count Peoples=").append(cnt);
        bb.append('}');
        return bb.toString();
    }

    @Override
    public int compareTo(Class_info o) {
        if (this.sq == o.sq) {
            return 0;
        } else if (this.sq < o.sq) {
            return -1;
        } else {
            return 1;
        }
    }
    public Class_info (String s1, double sq, int cnt){
        this.s1=s1;
        this.sq=sq;
        this.cnt=cnt;
    }
}
