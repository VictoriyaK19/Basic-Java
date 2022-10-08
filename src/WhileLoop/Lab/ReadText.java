package WhileLoop.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("Stop")) {

            System.out.println(command);

            command = scanner.nextLine();

        }

    }
}
