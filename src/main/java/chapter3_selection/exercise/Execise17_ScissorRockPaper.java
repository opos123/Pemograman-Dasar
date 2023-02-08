package chapter3_selection.exercise;

import java.util.Scanner;

public class Execise17_ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int) (Math.random() * 3);

        System.out.println("Scossor (0), rock(1), paper(2):");
        int user = input.nextInt();

        System.out.println("The computer is ");
        switch (computer) {
            case 0:
                System.out.println("Scissor.");
                break;
            case 1:
                System.out.println("rock.");
            case 2:
                System.out.println("paper.");
        }
        System.out.println(" You are");
        switch (user) {
            case 0:
                System.out.println("Scissor");
                break;
            case 1:
                System.out.println("rock.");
            case 2:
                System.out.println("paper.");
        }
        if (computer == user)
            System.out.println(" too. It is a draw");
        else {
            boolean win = (user == 0 && computer == 2) || (user == 1 & computer == 0) ||
                    (user == 2 && computer == 1);
            if (win)
                System.out.println(". You won");
            else
                System.out.println(". You lose");
        }
    }

}
