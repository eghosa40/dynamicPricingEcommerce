package org.example;

import java.util.ArrayList;

public class Apartment {
    private ArrayList<Oblong> rooms;

    public Apartment(){
        rooms = new ArrayList<>();
    }


    public Boolean add(Oblong room){
        rooms.add(room);
        System.out.println("Room Added");
        return true;
    }

    public double getRoomArea(int roomNumber){
        Oblong room = rooms.get(roomNumber);
        if(roomNumber < 0 || roomNumber >= rooms.size())
        {
            return -999;
        }
        return room.calculateArea();
    }

    public double getRoomLength(int roomNumber){
        Oblong room = rooms.get(roomNumber);
        if(roomNumber < 0 || roomNumber >= rooms.size())
        {
            return -999;
        }
        return room.getLength();
    }

    public double getRoomHeight(int roomNumber){
        Oblong room = rooms.get(roomNumber);
        if(roomNumber < 0 || roomNumber >= rooms.size())
        {
            return -999;
        }
        return room.getHeight();
    }
}
