package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double change = Math.round(input * 100);

        int count = 0;

        while (change > 0) {

            if (change >= 200) {
                change -= 200;
                count++;
            }else if (change >= 100) {
                change -= 100;
                count++;
            } else if (change >= 50) {
                change -= 50;
                count++;
            } else if (change >= 20) {
                change -= 20;
                count++;
            } else if (change >= 10) {
                change -= 10;
                count++;
            } else if (change >= 5) {
                change -= 5;
                count++;
            } else if (change >= 2) {
                change -= 2;
                count++;
            } else {
                change -= 1;
                count++;
            }
        }
        System.out.println(count);

    }
}
