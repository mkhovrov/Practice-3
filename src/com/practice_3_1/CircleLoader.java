package com.practice_3_1;
import java.util.Scanner;

public class CircleLoader {
    public static void main (String[] args)
    {
        Circle a = new Circle();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер окружности: ");
        a.setNumber (input.nextInt());
        System.out.print("Введите радиус окружности: ");
        a.setRadius(input.nextFloat());
        System.out.println("Длина окружности: "+ a.getLength());
        System.out.println("Площадь окружности: "+ a.getArea());

        System.out.println();

    }
}