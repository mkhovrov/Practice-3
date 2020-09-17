package com.practice_3_1;

public class Circle {

    private int number;
    private float radius, lenght;
    private double area;

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }

    public void setLength(float length){
        this.lenght = length;
    }
    public float getLength(){
        float length = (float) (radius * 2 * 3.14);
        return length;
    }

    public void setArea(float area){
        this.area = area;
    }
    public double getArea(){
        area = radius * radius * 3.14;
        return area;
    }

}