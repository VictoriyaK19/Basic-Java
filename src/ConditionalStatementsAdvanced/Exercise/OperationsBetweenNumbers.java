package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        boolean isValid = true;
        String type = "";

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    isValid = false;
                } else {
                    result = (double) n1 / n2;
                }
                break;
            case "%":
                if (n2 == 0) {
                    isValid = false;
                } else {
                    result = n1 % n2;
                }
                break;
        }

        if (result % 2 == 0) {
            type = "even";
        } else {
            type = "odd";
        }

        if (!isValid) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else {
            if (operator.equals("+") || operator.equals("-")
                    || operator.equals("*")) {
                System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, type);
            } else if (operator.equals("/")) {
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            } else {
                System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
            }
        }

    }
}
