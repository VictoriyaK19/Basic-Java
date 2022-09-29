package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double sum = 0;

        switch (town) {
            case "Sofia":
                if (sale < 0) {
                    isValid = false;
                } else if (sale <= 500) {
                    sum = sale * 0.05;
                } else if (sale <= 1000) {
                    sum = sale * 0.07;
                } else if (sale <= 10000) {
                    sum = sale * 0.08;
                } else {
                    sum = sale * 0.12;
                }
                break;

            case "Varna":
                if (sale < 0) {
                    isValid = false;
                } else if (sale <= 500) {
                    sum = sale * 0.045;
                } else if (sale <= 1000) {
                    sum = sale * 0.075;
                } else if (sale <= 10000) {
                    sum = sale * 0.10;
                } else {
                    sum = sale * 0.13;
                }
                break;

            case "Plovdiv":
                if (sale < 0) {
                    isValid = false;
                } else if (sale <= 500) {
                    sum = sale * 0.055;
                } else if (sale <= 1000) {
                    sum = sale * 0.08;
                } else if (sale <= 10000) {
                    sum = sale * 0.12;
                } else {
                    sum = sale * 0.145;
                }
                break;

            default:
                isValid = false;
                break;
        }

        if (isValid == false) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", sum);
        }

    }
}
