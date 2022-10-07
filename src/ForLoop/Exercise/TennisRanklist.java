package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int wins = 0;
        int winPoints = 0;

        for (int i = 0; i < tournaments; i++) {
            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    wins += 1;
                    winPoints += 2000;
                    break;
                case "F":
                    winPoints += 1200;
                    break;
                case "SF":
                    winPoints += 720;
                    break;
            }

        }



        System.out.printf("Final points: %d%n", winPoints + points);
        System.out.printf("Average points: %d%n", winPoints / tournaments);
        System.out.printf("%.2f%%%n", (double) wins / tournaments * 100);


    }
}
