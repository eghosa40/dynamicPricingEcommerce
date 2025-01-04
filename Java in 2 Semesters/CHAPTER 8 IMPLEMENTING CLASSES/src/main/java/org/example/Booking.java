package org.example;

public class Booking {
    private String room;
    private String name;

    public Booking(String roomIn, String nameIn)
    {
        room = roomIn;
        name = nameIn;
    }
    public Booking(){}

    public String getRoom(){
        return room;
    }

    public String getName(){
        return name;
    }

}
