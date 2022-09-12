package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sum = (nylon + 2) * 1.5 + paint * 1.1 * 14.5 + diluent * 5 + 0.4;
        double sumCraft = (sum * 0.3) * hours;
        double totalSum = sum + sumCraft;

        System.out.println(totalSum);

    }
}
