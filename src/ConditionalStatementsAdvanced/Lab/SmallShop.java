package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        if (town.equals("Sofia")) {
            if (product.equals("coffee")) {
                sum = 0.5 * quantity;
            } else if (product.equals("water")) {
                sum = 0.8 * quantity;
            } else if (product.equals("beer")) {
                sum = 1.2 * quantity;
            } else if (product.equals("sweets")) {
                sum = 1.45 * quantity;
            } else if (product.equals("peanuts")) {
                sum = 1.6 * quantity;
            }
        } else if (town.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                sum = 0.4 * quantity;
            } else if (product.equals("water")) {
                sum = 0.7 * quantity;
            } else if (product.equals("beer")) {
                sum = 1.15 * quantity;
            } else if (product.equals("sweets")) {
                sum = 1.3 * quantity;
            } else if (product.equals("peanuts")) {
                sum = 1.5 * quantity;
            }
        } else {
            if (product.equals("coffee")) {
                sum = 0.45 * quantity;
            } else if (product.equals("water")) {
                sum = 0.7 * quantity;
            } else if (product.equals("beer")) {
                sum = 1.10 * quantity;
            } else if (product.equals("sweets")) {
                sum = 1.35 * quantity;
            } else if (product.equals("peanuts")) {
                sum = 1.55 * quantity;
            }
        }
        System.out.println(sum);

    }
}
