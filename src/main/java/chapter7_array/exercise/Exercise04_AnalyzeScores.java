package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise04_AnalyzeScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];
        int num;
        int numberOfScores;
        int average;
        numberOfScores = average = 0;
        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numberOfScores++;
        }

        average /= numberOfScores;

        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average)
                aboveOrEqual++;
            else
                below++;
        }
        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of scores above oe equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }
}
