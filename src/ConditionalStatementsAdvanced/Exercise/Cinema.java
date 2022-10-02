package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        switch (type) {
            case "Premiere":
                sum = 12 * row * column;
                break;
            case "Normal":
                sum = 7.5 * row * column;
                break;
            case "Discount":
                sum = 5 * row * column;
                break;

        }

        System.out.printf("%.2f leva", sum);

    }
}
