package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();

        int standardTickets = 0;
        int studentTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (!film.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());

            String ticket = scanner.nextLine();


            int tickets = 0;

            while (!ticket.equals("End")) {

                switch (ticket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                tickets++;

                if (freeSeats == tickets) {
                    break;
                }

                ticket = scanner.nextLine();

            }

            totalTickets += tickets;

            System.out.printf("%s - %.2f%% full.%n", film, (double) tickets/freeSeats * 100);

            film = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (double) studentTickets / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", (double) standardTickets / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", (double) kidTickets / totalTickets * 100);

    }
}
