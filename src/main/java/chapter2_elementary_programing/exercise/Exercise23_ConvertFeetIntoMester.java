package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise23_ConvertFeetIntoMester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double METERS_PER_FOOT = 0.305;

        System.out.println("Enter a Value For Feet : ");
        double feet = input.nextDouble();

        double meters = feet * METERS_PER_FOOT;

        System.out.println(feet + " feet is " + meters + " meters");

    }
}
