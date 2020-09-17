package com.practice_3_2;

public class Human {

    public Head head;
    public Leg leftLeg, rightLeg;
    public Hand leftHand, rightHand;

    public Human(String headColor, String eyeColor, int speed, int strenght) {
        this.head = new Head(headColor, eyeColor);
        this.leftLeg = new Leg(false, speed);
        this.rightLeg = new Leg(true, speed);
        this.leftHand = new Hand(false, strenght);
        this.rightHand = new Hand(true, strenght);
    }

    public void setHead(Head head) {
        this.head = head;
    }
    public Head getHead() {
        return head;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }
    public Leg getLeftLeg() {
        return leftLeg;
    }


    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }
    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }
    public Hand getLeftHand() {
        return leftHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }
    public Hand getRightHand() {
        return rightHand;
    }

    public String canDo() {
        return head.canDo() + "\n" +
                rightHand.canDo() + "\n" +
                leftHand.canDo() + "\n" +
                rightLeg.canDo() + "\n" +
                leftLeg.canDo();
    }
}
