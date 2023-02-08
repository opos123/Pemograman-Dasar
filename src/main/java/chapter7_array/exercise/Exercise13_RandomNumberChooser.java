package chapter7_array.exercise;

public class Exercise13_RandomNumberChooser {
    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int) (Math.random() * 5);
            for (int e : numbers) {
                if (num == e) {
                    isExcluded = true;
                    break;
                }
            }
        } while (isExcluded);
        return num;
    }
}
