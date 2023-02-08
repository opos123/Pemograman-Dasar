package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise24_ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.454;

        System.out.println("Enter a number in punds: ");
        double pounds = input.nextDouble();

        double kilogram = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilogram + " kilograms");
    }
}
