package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {

            double moneyNeeded = Double.parseDouble(scanner.nextLine());

            while (moneyNeeded > 0) {
                double money = Double.parseDouble(scanner.nextLine());
                moneyNeeded -= money;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
