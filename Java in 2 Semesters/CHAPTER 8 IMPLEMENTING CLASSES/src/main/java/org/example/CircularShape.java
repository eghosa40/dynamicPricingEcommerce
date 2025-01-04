package org.example;

public class CircularShape {
    private double radius;

    CircularShape(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public double calculateDiameter(){
        return 2 * radius;
    }
}
