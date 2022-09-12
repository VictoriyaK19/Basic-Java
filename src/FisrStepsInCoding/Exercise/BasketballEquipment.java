package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakers = fee * 0.6;
        double outfit = sneakers * 0.8;
        double basketball = outfit * 0.25;
        double accessories = basketball * 0.2;

        double sum = fee + sneakers + outfit + basketball + accessories;

        System.out.println(sum);

    }
}
