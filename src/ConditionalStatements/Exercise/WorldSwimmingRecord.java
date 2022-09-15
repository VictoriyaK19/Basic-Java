package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double times = (distanceMeters / 15);
        double delay = Math.floor(times) * 12.5;

        double time = distanceMeters * timeSeconds + delay;

        if (time < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time-recordSeconds);
        }


    }
}
