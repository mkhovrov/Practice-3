package com.practice_3_2;

public class Hand {

    public boolean isRight;
    public int strong;

    public Hand(boolean isRight, int strong) {
        this.isRight = isRight;
        this.strong = strong;
    }

    public void setRight(boolean right) {
        isRight = right;
    }
    public boolean isRight() {
        return isRight;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }
    public int getStrong() {
        return strong;
    }

    public String canDo() {
        return isRight ? "Двигает правой рукой" : "Двигает левой рукой";
    }
}
