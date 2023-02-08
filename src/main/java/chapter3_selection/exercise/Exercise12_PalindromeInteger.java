package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise12_PalindromeInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit integer : ");
        int number = input.nextInt();

        int digit1 = number / 100;
        int remaining = number % 100;
        int digit3 = remaining % 10;

        System.out.println(number + ((digit1 == digit3) ? " is a " : " is not a ") + "" +
                "palindrome ");
    }
}
