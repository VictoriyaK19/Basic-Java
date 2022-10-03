package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;

        switch (season) {
            case "Spring":
                sum = 3000;
                if (fishermen <= 6) {
                    sum *= 0.9;
                } else if (fishermen <= 11) {
                    sum *= 0.85;
                } else {
                    sum *= 0.75;
                }
                break;
            case "Autumn":
            case "Summer":
                sum = 4200;
                if (fishermen <= 6) {
                    sum *= 0.9;
                } else if (fishermen <= 11) {
                    sum *= 0.85;
                } else {
                    sum *= 0.75;
                }
                break;
            case "Winter":
                sum = 2600;
                if (fishermen <= 6) {
                    sum *= 0.9;
                } else if (fishermen <= 11) {
                    sum *= 0.85;
                } else {
                    sum *= 0.75;
                }
                break;
        }

        if (!season.equals("Autumn")) {
            if (fishermen % 2 == 0) {
                sum *= 0.95;
            }
        }

        if (budget >= sum) {
            System.out.printf("Yes! You have %.2f leva left.", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", sum - budget);

        }

    }
}
