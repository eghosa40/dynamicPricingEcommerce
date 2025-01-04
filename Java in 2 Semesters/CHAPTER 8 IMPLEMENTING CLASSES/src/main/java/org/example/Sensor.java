package org.example;

public class Sensor {
    private double pressure;

    public Sensor(){}

    public Sensor(double pressure){
        this.pressure = pressure;
    }

    public boolean setPressure(double pressure){
        this.pressure = pressure;
        return true;
    }

    public double getPressure(){
        return pressure;
    }
}
