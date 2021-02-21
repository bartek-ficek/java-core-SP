package pl.bartek.ficek.exceptions.homework;

import java.util.Scanner;

public class Root {

    public static double getCorrectDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number to calculate square root: ");

        return scanner.nextDouble();
    }

    public static double calculate(Double number) {
        if (number < 0) {
            throw new IllegalArgumentException(String.format("Square root from number %.2f doesn't exist. Number has to be positive", number));
        }
        return Math.sqrt(number);
    }
}
