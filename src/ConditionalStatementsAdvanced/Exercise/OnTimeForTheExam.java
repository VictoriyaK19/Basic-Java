package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMin = Integer.parseInt(scanner.nextLine());

        int exam = examHour * 60  + examMin;
        int arriving = arrivingHour * 60  + arrivingMin;

        int h = Math.abs(exam - arriving);
        int m = Math.abs(exam - arriving);
        h /= 60;
        m -= h * 60;

        if (arriving == exam) {
            System.out.println("On time");
        } else if (arriving < exam) {

            if (exam - arriving > 30) {
                System.out.println("Early");
                if (h == 0) {
                    System.out.printf("%d minutes before the start", m);
                } else {
                    System.out.printf("%d:%02d hours before the start", h, m);
                }
            } else {
                System.out.println("On time");
                if (h == 0) {
                    System.out.printf("%d minutes before the start", m);
                } else {
                    System.out.printf("%d:%02d hours before the start", h, m);
                }
            }
        } else {
            System.out.println("Late");
            if (h == 0) {
                System.out.printf("%d minutes after the start", m);
            } else {
                System.out.printf("%d:%02d hours after the start", h, m);
            }
        }

    }
}
