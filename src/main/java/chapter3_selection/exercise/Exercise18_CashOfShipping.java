package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise18_CashOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the weight of the package: ");
        double weight = input.nextDouble();

        if (weight > 50)
            System.out.println("The package cannot be shipped");
        else {
            double costPerPound;
            if (weight > 0 && weight <= 1)
                costPerPound = 3.5;
            else if (weight <= 3)
                costPerPound = 5.5;
            else if (weight <= 10)
                costPerPound = 8.5;
            else
                costPerPound = 10.5;
            System.out.println("Shipping cost of package is $" + costPerPound * weight);
        }
    }
}
