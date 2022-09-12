package FisrStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) * 0.001;
        double occupiedSpace = percent / 100;
        double liters = volume * (1 - occupiedSpace);

        System.out.println(liters);

    }
}
