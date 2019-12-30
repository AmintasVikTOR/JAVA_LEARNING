/*
BMV, и что ей пресуще, чем могуч.. Назовем его, скажем, 'АП', т.е. Алеша Попович
* */

package com.company.garage.cars;

import com.company.garage.cars.api_my.ACars;
import com.company.garage.parts.engine.api_my.IEngine;

//this class was 'abstract'
public class Bmw extends ACars {
    private String model;
    private IEngine engine;

    public Bmw (String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return "BMV";
    }
}