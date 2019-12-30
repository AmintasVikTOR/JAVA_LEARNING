package com.company.garage.cars.api_my;

public abstract class ACars implements ICar{

    @Override
    public void drive() {
        System.out.println("Поехал");
    }

    @Override
    public void open() {
        System.out.println("Открыто");
    }

    @Override
    public void close() {
        System.out.println("Закрыто");
    }

    @Override
    public void start() {
        System.out.println("Запустили");
    }

    @Override
    public void stop() {
        System.out.println("Остановлено");
    }

    @Override
    public void fuel() {
        System.out.println("Заправляем");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем шины");

    }

    @Override
    public void driverSeat() {
        System.out.println("Садим водителя");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Садим поссажира");

    }
    @Override
    public Boolean go_speed(){
        System.out.println("Прибавили газку..");
        return null;
    }
    @Override
    public Boolean stop_speed(){
        System.out.println("Убавили газку..");
        return null;
    }

    }
