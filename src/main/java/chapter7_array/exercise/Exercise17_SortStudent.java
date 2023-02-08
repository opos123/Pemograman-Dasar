package chapter7_array.exercise;

import java.util.Scanner;

public class Exercise17_SortStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of student: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        System.out.println("Enter the name a score for each student: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.println("Score: ");
            scores[i] = input.nextInt();
        }
        sortDecreasing(students, scores);

        for (String e : students) {
            System.out.println(e);
        }
    }

    public static void sortDecreasing(String[] strs, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            int maxIndex = i;
            String temp;

            for (int j = i + 1; j < nums.length; i++) {
                if (nums[j] > max) {
                    max = nums[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                temp = strs[i];
                strs[i] = strs[maxIndex];
                strs[maxIndex] = temp;

                nums[maxIndex] = nums[i];
                nums[i] = max;
            }
        }
    }
}
