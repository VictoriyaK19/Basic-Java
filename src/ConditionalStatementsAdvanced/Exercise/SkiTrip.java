package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;
        double discount = 0.0;
        double sum = 0.0;

        switch (room) {
            case "room for one person":
                sum = 18 * nights;
                break;
            case "apartment":
                if (nights < 10) {
                    discount = 0.30;
                } else if (nights < 16) {
                    discount = 0.35;
                } else {
                    discount = 0.5;
                }
                sum = 25 * nights;
                sum *= 1 - discount;
                break;
            case "president apartment":
                if (nights < 10) {
                    discount = 0.1;
                } else if (nights < 16) {
                    discount = 0.15;
                } else {
                    discount = 0.2;
                }
                sum = 35 * nights;
                sum *= 1 - discount;
                break;
        }

        if (assessment.equals("positive")) {
            sum *= 1.25;
        } else {
            sum *= 0.9;
        }

        System.out.printf("%.2f", sum);

    }
}
