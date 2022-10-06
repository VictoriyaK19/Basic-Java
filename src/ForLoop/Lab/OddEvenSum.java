package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        int diff = 0;

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        if (sum1 == sum2) {
            System.out.println("Yes");
            System.out.println("Sum = " + sum1);
        } else {
            diff = Math.abs(sum2-sum1);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
