package ForLoop.Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());
        double fine = 0;

        for (int i = 1; i <= tabs ; i++) {
            String website = scanner.nextLine();

            if (salary <=0) {
                break;
            }

            switch (website) {
                case "Facebook":
                    fine += 150;
                    salary -= fine;
                    break;
                case "Instagram":
                    fine += 100;
                    salary -= fine;
                    break;
                case "Reddit":
                    fine += 50;
                    salary -= fine;
                    break;
            }
        }

        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }

    }
}
