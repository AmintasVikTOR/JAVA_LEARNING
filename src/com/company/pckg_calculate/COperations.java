package com.company.pckg_calculate;

public class COperations implements IOperations {

    private double a;
    private double b;

    public COperations(){
        this.a=a;
        this.b=b;
    }

    @Override
    public double mult(double a, double b) {
        System.out.print("Результат умножения: "+a+" умножить на "+b+" = ");
        return a*b;
    }

    @Override
    public double sum(double a, double b) {
        System.out.print("Результат суммирования: "+a+" плюс "+b+" = ");
        return a+b;
    }

    @Override
    public double minus(double a, double b) {
        System.out.print("Результат вычитания: "+a+" минус "+b+" = ");
        return a-b;
    }

    @Override
    public double divide(double a, double b) {
        System.out.print("Результат деления: "+a+" разделить на "+b+" = ");
        return a/b;
    }
}
