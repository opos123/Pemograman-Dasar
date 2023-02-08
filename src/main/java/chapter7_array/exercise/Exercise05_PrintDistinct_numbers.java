package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise05_PrintDistinct_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] distincNumbers = new int[10];
        int num;
        int count = 0;

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            if (isDistinct(distincNumbers, num)) {
                distincNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct number are");
        for (int i = 0; i < distincNumbers.length; i++) {
            if (distincNumbers[i] > 0)
                System.out.println(" " + distincNumbers[i]);
        }
        System.out.println();
    }

    public static boolean isDistinct(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return false;
        }
        return true;
    }
}
