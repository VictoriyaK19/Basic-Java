package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashing = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double money = 0.0;
        int toys = 0;
        int times = 1;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += 10 * times;
                money -= 1;
                times +=1;
            } else {
                toys +=1;
            }

        }

        double budget = toys * priceToy + money;

        if (budget >= priceWashing) {
            System.out.printf("Yes! %.2f", budget - priceWashing);
        } else {
            System.out.printf("No! %.2f", priceWashing - budget);
        }

    }
}
