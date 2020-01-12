package com.company.pckg_garage.parts.engine.api_my;

public interface IEngine {
    String getId();
    FuelType getFuelType();
    int getCapacity();

    boolean start();
    boolean stop();
    double running();

}
