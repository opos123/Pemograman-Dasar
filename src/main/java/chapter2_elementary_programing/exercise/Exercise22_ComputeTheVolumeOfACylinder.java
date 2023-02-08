package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise22_ComputeTheVolumeOfACylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159265359;


        System.out.println("Enter the Radius and length of a cylinder : ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The Volume is " + volume + "meters");
    }
}
