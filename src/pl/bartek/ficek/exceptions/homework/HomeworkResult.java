package pl.bartek.ficek.exceptions.homework;

public class HomeworkResult {

    public static void main(String[] args) {

        do {
            try {
                double inputData = Root.getCorrectDataFromUser();
                System.out.println(Root.calculate(inputData));
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
