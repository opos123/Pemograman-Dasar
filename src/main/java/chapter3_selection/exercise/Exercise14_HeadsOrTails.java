package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise14_HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.println("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();

        System.out.println(((guess == coin) ? "Corret" : "Incorret") + "guess.");
    }
}
