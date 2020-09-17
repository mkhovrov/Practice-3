package com.practice_3_2;

public class Leg  {

    public boolean isRight;
    public int speed;

    public Leg(boolean isRight, int speed) {
        this.isRight = isRight;
        this.speed = speed;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
    public boolean isRight() {
        return isRight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }

    public String canDo() {
        return isRight ? "Двигает правой ногой" : "Двигает левой ногой";
    }
}
