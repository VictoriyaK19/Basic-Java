package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1 = Integer.parseInt(scanner.nextLine());
        int i2 = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());

        int totalCount = 0;
        boolean notFound = true;

        for (int i = i1; i <= i2; i++) {
            for (int j = i1; j <= i2; j++) {
                totalCount++;
                if (i + j == num) {
                    notFound = false;
                    System.out.printf("Combination N:%d (%d + %d = %d)", totalCount, i, j, num);
                    break;
                }
                if (notFound == false) {
                    break;
                }
            }
            if (notFound == false) {
                break;
            }
        }
        if (notFound == true) {
            System.out.printf("%d combinations - neither equals %d", totalCount, num);
        }
    }
}
