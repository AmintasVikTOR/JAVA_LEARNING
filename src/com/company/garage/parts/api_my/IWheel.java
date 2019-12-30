package com.company.garage.parts.api_my;

import com.company.garage.parts.engine.api_my.FuelType;
import com.company.garage.parts.engine.api_my.IChangebleFuelType;

public interface IWheel {

    EnWheelsBrandName getBrandName();
    EnWeelsRadius getRadius();
    EnWeelsSeason getWheelSeason();
    void setRadius(EnWeelsRadius radius);
    void setSeason(EnWeelsSeason season);
        void setBrandName(EnWheelsBrandName brandName);

    class AudiEngineOriginal implements IChangebleFuelType {
        private final String id;
        private final int capacity;
        private FuelType fuelType;
        private boolean running = false;

        public AudiEngineOriginal(){

            this.capacity = getCapacity();
            this.fuelType = fuelType;
            this.id = getId();

        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public int getCapacity() {
            return capacity;
        }

        @Override
        public FuelType getFuelType() {
            return fuelType;
        }

        @Override
        public void setFuelType(FuelType fuelType) {
            this.fuelType = fuelType;
        }

        public boolean start(){
            if(!running){
                running = true;
            } else {
    //            throw new IllegalArgumentException("Немогу завесту уже заведенный мотор");
            }
            return running;
        }
        public boolean stop(){
            if(running){
                running = false;
            } else {
    //            throw new IllegalArgumentException("Немогу остановить уже остановленный мотор");
            }
            return running;
        }
        public double running(){
            if(running){
                //TODO добавить рандом
                return 2;
            }
            return 0;
        }
    }
}