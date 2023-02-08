package chapter2_elementary_programing.exercise;

import java.util.Scanner;

public class Exercise28_CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMiliseconds = System.currentTimeMillis();
        long totalSeconds = totalMiliseconds / 1000;
        long curentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long curentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long curentHour = totalHours % 24;
        curentHour = curentHour + offset;

        System.out.println("Current Time is " + curentHour + ":" + curentMinutes + ":" + curentSeconds);
    }
}
