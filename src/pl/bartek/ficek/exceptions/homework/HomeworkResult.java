package pl.bartek.ficek.exceptions.homework;

import java.util.InputMismatchException;

public class HomeworkResult {

    public static void main(String[] args) {

        while (true) {
            try {
                double inputData = Root.getCorrectDataFromUser();
                System.out.println(String.format("Square root from number %.2f equals %.2f",inputData,Root.calculate(inputData)));
                break;
            } catch (IllegalArgumentException e1) {
                System.out.println(e1.getMessage());
            } catch (InputMismatchException e2) {
                System.out.println("That's not a number. Give the correct one");

            }
        }
    }
}
