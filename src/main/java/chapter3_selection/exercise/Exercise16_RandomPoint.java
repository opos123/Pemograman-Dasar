package chapter3_selection.exercise;

public class Exercise16_RandomPoint {
    public static void main(String[] args) {

        int width = (int) ((Math.random() * (50 + 50)) - 50);
        int height = (int) ((Math.random() * (100 + 100)) - 100);

        System.out.println("Random coordinate is rectangle centered at (0,0)");
        System.out.println("With width 100 and height 200 : (" + width + ", " + height + ")");


    }
}
