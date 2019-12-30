package com.company.garage.parts.engine;

import com.company.garage.parts.api_my.EnWeelsRadius;
import com.company.garage.parts.api_my.EnWeelsSeason;
import com.company.garage.parts.api_my.EnWheelsBrandName;
import com.company.garage.parts.api_my.IWheel;

public class WheelsClass implements IWheel {
    private EnWeelsSeason e_season;
    private EnWeelsRadius e_radius;
    private EnWheelsBrandName e_brand;
    public WheelsClass(){

        this.e_radius=e_radius;
        this.e_season=e_season;
        this.e_brand=e_brand;
    }
    @Override
    public void setRadius(EnWeelsRadius e_radius)
    {
        this.e_radius=e_radius;
    }

    @Override
    public void setSeason(EnWeelsSeason e_season)
    {
        this.e_season=e_season;
    }

    @Override
    public void setBrandName(EnWheelsBrandName e_brand)
    {
        this.e_brand=e_brand;
    }

    @Override
    public EnWeelsRadius getRadius() {
        return e_radius;
    }

    @Override
    public EnWeelsSeason getWheelSeason() {
        return e_season;
    }

    @Override
    public EnWheelsBrandName getBrandName() {
        return e_brand;
    }
}
