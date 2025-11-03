package com.currency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Currency Exchange CLI | frankfurter.dev ====");

        System.out.println("From (provide currency, e.g., \"USD\"): ");
        String from = scanner.nextLine().toUpperCase();

        System.out.println("To (provide currency, e.g., \"PLN\"): ");
        String to = scanner.nextLine().toUpperCase();

        System.out.println("Provide amount: ");
        double amount = scanner.nextDouble();


        try {
            double rate = ApiClient.getExchange(from, to);
            System.out.println("Current rate: " + rate);

            double result = amount * rate;
            System.out.printf("%.2f %s = %.2f %s", amount, from, result, to);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
