package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise29_physics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t :");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.println("The average acceleration is " + a);

    }
}
