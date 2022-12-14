package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < jury; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            pointsAcademy += (name.length() * points)/2;
            if (pointsAcademy > 1250.5) {
                break;
            }
        }

        if (pointsAcademy > 1250.5) {
            System.out.printf("Congratulations, %s " +
                    "got a nominee for leading role with %.1f!", actor, pointsAcademy);
        } else {
            System.out.printf("Sorry, %s" +
                    " you need %.1f more!", actor, 1250.5 - pointsAcademy);
        }

    }
}
