package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise15_Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotery = (int) (Math.random() * 1000);

        System.out.println("Enter a three-digit number: ");
        int guess = input.nextInt();

        int loteryDigit1 = lotery / 100;
        int remainingDigits = lotery % 100;
        int loteryDigit2 = remainingDigits / 10;
        int loteryDigit3 = remainingDigits % 10;

        int guessDigit1 = guess / 100;
        int remainingDigits1 = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        int guessDigit3 = remainingDigits % 10;

        System.out.println("The Lottery number is " + lotery);

        if (guess == lotery)
            System.out.println("Exact match : you win $10,000");
        if (guessDigit1 == loteryDigit2) {

        }

    }
}

