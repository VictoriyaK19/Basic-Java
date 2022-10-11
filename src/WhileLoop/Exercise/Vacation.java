package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyTour = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        int days = 0;
        int spending = 0;

        while (moneyTour > budget) {

            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            days++;

            if (action.equals("save")) {
                budget += money;
                spending = 0;
            } else {
                budget -= money;
                spending++;
                if (budget <= 0) {
                    budget = 0;
                }
            }

            if (spending == 5) {
                break;
            }

        }

        if (spending == 5) {
            System.out.printf("You can't save the money. %n%d", days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }


    }
}
