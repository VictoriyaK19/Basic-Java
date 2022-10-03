package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioSum = 0.0;
        double apartmentSum = 0.0;

        switch (month) {
            case "May":
            case "October":
                studioSum = 50 * nights;
                apartmentSum = 65 * nights;
                if (nights > 14) {
                    studioSum *= 0.7;
                } else if (nights > 7) {
                    studioSum *= 0.95;
                }
                break;
            case "June":
            case "September":
                studioSum = 75.2 * nights;
                apartmentSum = 68.7 * nights;
                if (nights > 14) {
                    studioSum *= 0.8;
                }
                break;
            case "July":
            case "August":
                studioSum = 76 * nights;
                apartmentSum = 77 * nights;
                break;
        }

        if (nights > 14) {
            apartmentSum *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.", apartmentSum);
        System.out.printf("%nStudio: %.2f lv.", studioSum);

    }
}
