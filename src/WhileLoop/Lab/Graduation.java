package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int fails = 0;
        double totalMarks = 0;
        int grade = 0;

        while (grade < 12) {

            double mark = Double.parseDouble(scanner.nextLine());

            if (mark < 4) {
                fails += 1;
            } else {
                totalMarks += mark;
                grade += 1;
            }
            if (fails > 1) {
                grade += 1;
                 break;
            }

        }

        if (fails < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalMarks/12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, grade);
        }

    }
}
