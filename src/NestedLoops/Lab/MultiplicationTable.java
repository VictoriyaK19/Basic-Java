package NestedLoops.Lab;

public class MultiplicationTable {
    public static void main(String[] args) {

        int result = 0;

        for (int m1 = 1; m1 <= 10; m1++) {
            for (int m2 = 1; m2 <= 10; m2++) {
                result = m1 * m2;
                System.out.printf("%d * %d = %d%n", m1, m2, result);
            }
        }
    }
}
