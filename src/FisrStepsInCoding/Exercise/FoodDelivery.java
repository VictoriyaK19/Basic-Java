package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu1 = Integer.parseInt(scanner.nextLine());
        int menu2 = Integer.parseInt(scanner.nextLine());
        int menu3 = Integer.parseInt(scanner.nextLine());

        double menus = menu1 * 10.35 + menu2 * 12.4 + menu3 * 8.15;
        double desert = menus * 0.2;
        double sum = menus + desert + 2.5;

        System.out.println(sum);
    }
}
