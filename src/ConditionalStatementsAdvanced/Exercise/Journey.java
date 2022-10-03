package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double sum = 0.0;
        String vacation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                sum = budget * 0.3;
                vacation = "Camp";
            } else {
                sum = budget * 0.7;
                vacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                sum = budget * 0.4;
                vacation = "Camp";
            } else {
                sum = budget * 0.8;
                vacation = "Hotel";
            }
        } else {
            destination = "Europe";
            sum = budget * 0.9;
            vacation = "Hotel";

        }

        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", vacation, sum);

    }
}
