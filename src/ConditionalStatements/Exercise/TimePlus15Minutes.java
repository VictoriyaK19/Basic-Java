package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        num2 += 15;
        if (num2 > 59) {
            num1 += 1;
            num2 -= 60;
        }
        if (num1 == 24) {
            num1 = 0;
        }

        System.out.printf("%d:%02d", num1, num2);
    }
}
