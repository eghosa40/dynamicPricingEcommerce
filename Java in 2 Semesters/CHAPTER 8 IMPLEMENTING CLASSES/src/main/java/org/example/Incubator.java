package org.example;

public class Incubator {
    private int temperature;
    public static int MAX = 10;
    public static int MIN = -10;

    public Incubator(){
        temperature = 5;
    }

    public int getTemperature(){
        return temperature;
    }

    public void increaseTemperature(boolean alarm){
        if(temperature + 1 > MAX){
            if (alarm){
                System.out.println("ALARM! Temperature exceeded MAX limit: " + MAX);
            }
        }else {
            temperature++;
        }
    }

    public void decreaseTemperature(boolean alarm){
        if (temperature - 1 < MIN){
            if (alarm){
                System.out.println("ALARM! Temperature fell bellow MIN limit: " + MIN);
            }
        }
        else {
            temperature--;
        }
    }
}
