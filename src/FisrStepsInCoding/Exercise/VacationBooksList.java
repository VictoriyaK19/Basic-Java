package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hours = pages / pagesForHour / days;

        System.out.println(hours);

    }
}
