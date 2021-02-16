package pl.bartek.ficek.interfaces.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type \"M/m\" for multiplication or \"A/a\" for addition two numbers: \n");
        String choice = scanner.next();
        boolean decision;
        do {
            if (choice.equalsIgnoreCase("M")) {
                decision = true;
                break;
            } else if (choice.equalsIgnoreCase("A")) {
                decision = false;
                break;
            } else {
                System.out.println("Please type correct command.");
            }
        } while (true);

        return decision;
    }

    private double getArgument() {
        return 0; // tutaj pobierz liczbę od użytkownika
    }
}
