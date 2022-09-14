package ConditionalStatements.Lab;

import java.util.Scanner;

public class ExellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = Integer.parseInt(scanner.nextLine());

        if (mark >= 5) {
            System.out.println("Excellent!");
        }

    }
}
