package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double lunchTime = rest * 0.125;
        double relaxTime = rest * 0.25;
        double restTime = rest - lunchTime - relaxTime;

        double free = Math.abs(restTime - episode);
        free = Math.ceil(free);

        if (restTime >= episode) {
            System.out.printf("You have enough time to watch %s " +
                              "and left with " + Math.round(free) + " minutes free time.", series);
        } else {
            System.out.printf("You don't have enough time to watch %s, " +
                              "you need " + Math.round(free) + " more minutes.", series);
        }


    }
}
