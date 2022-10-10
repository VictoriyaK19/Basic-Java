package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String foundBook = scanner.nextLine();
        int checks = 0;

        while (!foundBook.equals("No More Books")) {

            if (foundBook.equals(book)) {
                break;
            }

            checks +=1;
            foundBook = scanner.nextLine();
        }

        if (foundBook.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", checks);
        } else {
            System.out.printf("You checked %d books and found it.", checks);
        }

    }
}
