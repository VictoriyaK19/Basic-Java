package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day= scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double sum = 0;
        boolean isValid = true;

        if (day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday")){

            if (fruit.equals("banana")) {
                sum = 2.5 * quantity;
            } else if (fruit.equals("apple")) {
                sum = 1.20 * quantity;
            } else if (fruit.equals("orange")) {
                sum = 0.85 * quantity;
            }else if (fruit.equals("grapefruit")) {
                sum = 1.45 * quantity;
            }else if (fruit.equals("kiwi")) {
                sum = 2.7 * quantity;
            }else if (fruit.equals("pineapple")) {
                sum = 5.5 * quantity;
            }else if (fruit.equals("grapes")) {
                sum = 3.85 * quantity;
            } else {
                isValid = false;
            }

        } else if (day.equals("Saturday")
                || day.equals("Sunday")){

            if (fruit.equals("banana")) {
                sum = 2.7 * quantity;
            } else if (fruit.equals("apple")) {
                sum = 1.25 * quantity;
            } else if (fruit.equals("orange")) {
                sum = 0.9 * quantity;
            }else if (fruit.equals("grapefruit")) {
                sum = 1.60 * quantity;
            }else if (fruit.equals("kiwi")) {
                sum = 3 * quantity;
            }else if (fruit.equals("pineapple")) {
                sum = 5.6 * quantity;
            }else if (fruit.equals("grapes")) {
                sum = 4.20 * quantity;
            } else {
                isValid = false;
            }

        } else {
            isValid = false;
        }

        if (isValid == true) {
            System.out.printf("%.2f", sum);
        } else {
            System.out.println("error");
        }

    }
}
