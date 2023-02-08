package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise18_BubleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter a numbers : ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        bubbleSort(numbers);

        for (double e : numbers) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
