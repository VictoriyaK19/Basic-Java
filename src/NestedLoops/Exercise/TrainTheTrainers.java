package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int totalMarks = 0;
        int times = 0;
        double totalMark = 0.0;

        String presentation = scanner.nextLine();

        while (!presentation.equals("Finish")) {

            double averageMark = 0;
            double marks = 0;

            for (int i = 0; i < count; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                marks += mark;

                times++;
            }
            averageMark = marks / count;
            System.out.printf("%s - %.2f.%n", presentation, averageMark);

            totalMarks += count;

            totalMark += marks;
            presentation = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalMark / totalMarks);

    }
}
