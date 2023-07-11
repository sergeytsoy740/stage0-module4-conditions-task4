package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(12, 1, 10);
    }
    public static void printGreatest(int first, int second, int third) {
        int max = 0;

        max = third >= (max = first >= second ? first : second) ? third : max;

        System.out.println(max);
    }
}
