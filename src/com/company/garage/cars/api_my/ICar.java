package com.company.garage.cars.api_my;

public interface ICar {
    String getModel();
    String getBrand();

    //прибавить газку..
    Boolean go_speed();

    //убавить газку..
    Boolean stop_speed();

    //ехать
    void drive();

    //окт.дверь
    //boolean open(IKey key);
    void open();

    //закр.дверь
    void close();

    //запустить двигатель
    void start();

    //ост.двигатель
    void stop();

    //топливо
    void fuel();

    //колеса/резина
    void changeWheel();

    //место водителя
    void driverSeat();

    //место пасажира
    void passengerSeat();
}
