package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise27_FindTheNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Number Of Minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        System.out.println(minutes + " minutes is approximately " + years +
                " years and " + days + "days");
    }
}
