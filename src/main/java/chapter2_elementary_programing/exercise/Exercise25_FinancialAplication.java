package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise25_FinancialAplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter The Subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);


    }
}
