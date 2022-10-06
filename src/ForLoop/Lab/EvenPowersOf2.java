package ForLoop.Lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 2;
        int result = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                result = (int) Math.pow(num, i);
                System.out.println(result);
            }
        }

    }
}
