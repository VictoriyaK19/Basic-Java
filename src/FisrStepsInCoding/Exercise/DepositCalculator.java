package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depSum = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        double sum = depSum + term * ((depSum * interestRate/100)/12);

        System.out.println(sum);

    }
}
