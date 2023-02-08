package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise26_UseTheOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer : ");
        int number = input.nextInt();

        System.out.println("Is 10 divisible by 5 and 6 ?" +
                ((number % 5 == 0) && (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 or 6 ?" +
                ((number % 5 == 0) || (number % 6 == 0)));
        System.out.println("Is 10 divisible by 5 of 6, but not both ?" +
                ((number % 5 == 0) ^ (number % 6 == 0)));
    }

}
