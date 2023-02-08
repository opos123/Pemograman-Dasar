package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise08_AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];

        System.out.println("Enter ten values of double type: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("The average value: " + average(values));
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i : array)
            average += i;
        return average / array.length;
    }

    public static double average(double[] array) {
        double average = 0;
        for (double i : array)
            average += i;
        return average / array.length;
    }
}
