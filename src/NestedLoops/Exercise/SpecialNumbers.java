package NestedLoops.Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int n = 1111; n <= 9999; n++) {

            boolean notSpecial = false;

            String currentNum = Integer.toString(n);
            for (int i = 0; i < currentNum.length(); i++) {

                int currentDigit = Integer.parseInt("" + currentNum.charAt(i));

                if (currentDigit == 0) {
                    notSpecial = true;
                    break;
                }else if (num % currentDigit != 0) {
                    notSpecial = true;
                    break;
                }
            }

            if (!notSpecial) {
                System.out.printf("%d ", n);
            }
        }
    }
}
