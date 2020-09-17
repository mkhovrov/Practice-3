package com.practice_3_2;

public class Hand {

    public boolean isRight;
    public int strenght;

    public Hand(boolean isRight, int strenght) {
        this.isRight = isRight;
        this.strenght = strenght;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
    public boolean isRight() {
        return isRight;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }
    public int getStrenght() {
        return strenght;
    }

    public String canDo() {
        return isRight ? "Двигает правой рукой" : "Двигает левой рукой";
    }
}
