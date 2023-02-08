package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise20_WindChilTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three temperature in fahrenheit " +
                "between -58F and 41f: ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = input.nextDouble();

        if (temperature <= -58 || temperature >= 41 || speed < 2) {
            System.out.println("The ");
            if (temperature <= -58 || temperature >= 41)
                System.out.println("temperature ");
            if ((temperature <= -58 || temperature >= 41) && speed < 2)
                System.out.println("and ");
            System.out.println("is invalid");
            System.exit(1);
        }

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);

        System.out.println("The wind chill index is " + windChill);


    }
}
