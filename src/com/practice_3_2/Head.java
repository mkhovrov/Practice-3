package com.practice_3_2;

public class Head {

    public String hairColor;
    public String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getHairColor() {
        return hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }

    public String canDo() {
        return "Размышляет";
    }
}