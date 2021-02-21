package pl.bartek.ficek.exceptions.homework;

import java.util.Scanner;

public class Root {

    Scanner scanner = new Scanner(System.in);

    public double getDataFromUser() {
        if (!scanner.hasNextDouble()) {
            throw new NumberFormatException("Give the correct number");
        }
        double number = scanner.nextDouble();
        return number;
    }

    public void calculate(Double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number has to be positive");
        }
        double resultSquareRoot = Math.sqrt(number);
        System.out.println(resultSquareRoot);
    }
}
