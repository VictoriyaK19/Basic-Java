package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int tasks = 0;
        double totalMark = 0;
        String task = "";
        int poorGrades = 0;

        while (!input.equals("Enough")) {

            task = input.toString();
            tasks++;

            int mark = Integer.parseInt(scanner.nextLine());

            totalMark += mark;

            if (mark <= 4) {
                marks--;
                poorGrades++;
            }
            if (marks < 1) {
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", totalMark/tasks);
            System.out.printf("Number of problems: %d%n", tasks);
            System.out.printf("Last problem: %s%n", task);
        } else {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        }
    }
}
