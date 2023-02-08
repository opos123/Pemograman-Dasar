package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise14_ComputeGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter Five number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The greatest common divisior is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        boolean inDivisor;

        for (int i = 2; i < min(numbers); i++) {
            inDivisor = true;
            for (int e : numbers) {
                if (e % i != 0) {
                    inDivisor = false;
                    break;
                }
            }
            if (inDivisor)
                gcd = i;
        }
        return gcd;
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int e : numbers) {
            if (e < min)
                min = e;
        }
        return min;
    }
}
