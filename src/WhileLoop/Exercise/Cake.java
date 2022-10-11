package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int pieces = length * width;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int getPieces = Integer.parseInt(input);

            pieces -= getPieces;

            if (pieces < 0) {
                break;
            }

            input = scanner.nextLine();
        }
        if (pieces < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
