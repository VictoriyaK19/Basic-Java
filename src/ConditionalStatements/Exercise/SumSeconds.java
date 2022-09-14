package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second +third;

        int minutes = sum / 60;
        int seconds = sum % 60;

        //Печатането на резултата с водеща нула може да се осъществи
        // и чрез шаблона %02d, чрез който можем да покажем,
        // че искаме нашето цяло число (секундите) да се
        // състои от две цифри:
        System.out.printf("%d:%02d", minutes, seconds);

    }
}
