/*
AUDI, и что ей пресуще, чем могуч.. Назовем его, скажем, 'ДН', т.е. Добрыня... оставим интриги для забугорных буржуев..
* */
package com.company.garage.cars;

import com.company.garage.cars.api_my.ACars;
import com.company.garage.parts.engine.api_my.IEngine;

public abstract class Audi extends ACars {
    private String model;
    private IEngine engine;

    public Audi(String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "AUDI";
    }
}