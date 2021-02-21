package pl.bartek.ficek.exceptions.homework;

import java.util.Scanner;

public class Root {

    public static double getCorrectDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number to calculate square root: ");

        if (!scanner.hasNextDouble()) {
            throw new NumberFormatException("That's not a number. Give the correct one");
        }
        return scanner.nextDouble();
    }

    public static double calculate(Double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number has to be positive");
        }
        return Math.sqrt(number);
    }
}
