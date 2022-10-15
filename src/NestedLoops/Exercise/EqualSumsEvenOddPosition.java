package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i1 = Integer.parseInt(scanner.nextLine());
        int i2 = Integer.parseInt(scanner.nextLine());


        for (int num = i1; num <= i2; num++) {

            String currentNum = "" + num;

            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNum.length(); j++) {

                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum){
                System.out.printf(num + " ");
            }
        }

    }
}
