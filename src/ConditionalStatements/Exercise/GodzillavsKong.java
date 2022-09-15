package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double priceCloth = Double.parseDouble(scanner.nextLine());

        double clothes = 0.0;
        double decor = budget * 0.10;

        if (extras > 150) {
            clothes = (extras * priceCloth) * 0.9;
        } else {
            clothes = extras * priceCloth;
        }

        double rest = Math.abs(budget - (decor + clothes));

        if (decor + clothes > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", rest);
        } else {
            System.out.println("Action!" );
            System.out.printf("Wingard starts filming with %.2f leva left.", rest);
        }

    }
}
