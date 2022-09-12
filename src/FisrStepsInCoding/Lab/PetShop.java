package FisrStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());

        double sum = dogs * 2.5 + cats * 4;

        System.out.println(sum + " lv.");

    }
}
