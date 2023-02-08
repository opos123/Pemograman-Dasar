package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise21_ConvertCelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a degree in celcius : ");
        double celcius = input.nextDouble();

        double fahrenheit = 9.0 / 5 * celcius + 32;

        System.out.println(celcius + " Celcius is " + fahrenheit + " fahrenheit");

    }

}
