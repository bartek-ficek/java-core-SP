package pl.bartek.ficek.interfaces.homework;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        boolean decision;
        System.out.println("\nPlease type \"M/m\" for multiplication or \"A/a\" for addition of two numbers: \n");

        do {
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("M")) {
                decision = true;
                break;
            } else if (choice.equalsIgnoreCase("A")) {
                decision = false;
                break;
            } else {
                System.out.println("Please type correct command.");
                continue;
            }
        } while (true);

        return decision;
    }

    private double getArgument() {
        System.out.println("Type number to calculate");
        return scanner.nextDouble();
    }
}
