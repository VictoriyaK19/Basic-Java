package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = (pens * 5.8 + markers * 7.20 + detergent * 1.2) * (100 - discount)/100;

        System.out.println(sum);

    }
}
