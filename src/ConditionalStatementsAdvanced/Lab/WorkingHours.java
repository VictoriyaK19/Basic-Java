package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (day.equals("Sunday")) {
            System.out.println("closed");
        } else  {
            if (time >= 10 && time <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }
    }
}
