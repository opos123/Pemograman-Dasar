package chapter7_array.latihan;

import java.util.Scanner;

public class listing1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items : ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.println(" Enter the number : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}
