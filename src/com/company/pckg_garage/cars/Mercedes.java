/*
MERCEDES, и что ей пресуще, чем могуч.. Назовем его, скажем, 'ИМ', т.е. Илья Муромец
* */
package com.company.pckg_garage.cars;

import com.company.pckg_garage.cars.api_my.ACars;
import com.company.pckg_garage.parts.engine.api_my.IEngine;

public class Mercedes extends ACars {
    private String model;
    private IEngine engine;

    public Mercedes(String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "Mercedes";
    }
}
