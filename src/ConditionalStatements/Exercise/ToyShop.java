package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalToys = puzzles + dolls + bears + minions + trucks;

        double totalMoney = puzzles * 2.6 + dolls * 3 + bears * 4.1
                            + minions * 8.20  + trucks * 2;

        if (totalToys >= 50) {
            totalMoney *= 0.75;
        }

        totalMoney *= 0.9;
        double rest = Math.abs(totalMoney - vacation);


        if (totalMoney >= vacation) {
            System.out.printf("Yes! %.2f lv left.", rest);
        }   else {
            System.out.printf("Not enough money! %.2f lv needed.", rest);
        }

    }
}
