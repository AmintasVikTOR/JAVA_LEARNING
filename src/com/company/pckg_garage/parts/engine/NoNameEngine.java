/*
* Это движ, произведенный в подпольном московском чиркизоне...
* */

package com.company.pckg_garage.parts.engine;

import com.company.pckg_garage.parts.engine.api_my.FuelType;
import com.company.pckg_garage.parts.engine.api_my.IEngine;

public class NoNameEngine implements IEngine {
    @Override
    public String getId() {
        return null;
    }

    @Override
    public FuelType getFuelType() {
        return null;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public boolean start() {
        System.out.println("Завёлся... И немного глохну");
        return true;
    }

    @Override
    public boolean stop() {
        System.out.println("Остановился");
        return true;

    }

    @Override
    public double running() {
        System.out.println("Ем бензин не в себя");
        return 1;
    }
}
