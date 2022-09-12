package FisrStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double sum = area * 7.61;

        double discount = sum * 0.18;
        double finalSum = sum - discount;

        System.out.println("The final price is: " + finalSum + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
