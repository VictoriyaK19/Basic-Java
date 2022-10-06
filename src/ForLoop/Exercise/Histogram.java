package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1 += 1;
            } else if (num < 400) {
                p2 += 1;
            } else if (num < 600) {
                p3 += 1;
            } else if (num < 800) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        String symbol = "%";
        int sum = p1 + p2 + p3 + p4 + p5;

        System.out.printf("%.2f%s" , (double) p1 / sum * 100, symbol);
        System.out.printf("%n%.2f%s" , (double) p2 / sum * 100, symbol);
        System.out.printf("%n%.2f%s" , (double) p3 / sum * 100, symbol);
        System.out.printf("%n%.2f%s" , (double) p4 / sum * 100, symbol);
        System.out.printf("%n%.2f%s" , (double) p5 / sum * 100, symbol);

    }
}
