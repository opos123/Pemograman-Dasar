package chapter3_selection.exercise;

import java.util.Scanner;

public class Exercise28_TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter r1's center x-, y-coordinates, width and height : ");
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        System.out.println("Enter r2's center x-, y-coordinates, width and height :");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

//        if ((Math.pow(Math.pow(r2y - r1y,2), .05) +r2Height / 2 <= r1Height / 2) &&
//                (Math.pow(Math.pow(r2x - r1x,2 ), .05) + r2Width / 2 <= r1Width / 2) &&
//                (r1Height / 2 + r2Height / 2 <= r1Height) &&
//                (r1Width / 2 + r2Width / 2 <= r1Width )
//            System.out.println("r2 is inside r1");


    }

}
