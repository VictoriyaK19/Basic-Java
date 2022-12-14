package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int diff = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            sum += num;

            if (num > max) {
                max = num;
            }

        }

        sum -= max;

        if (max == sum) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            diff = Math.abs(max-sum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
