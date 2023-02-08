package chapter7_array.exercise;

public class Exercise07_CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 1; i <= 100; i++) {
            counts[(int) (Math.random() * 10)]++;
        }
        System.out.println("count for each number between 0 and 9: ");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
