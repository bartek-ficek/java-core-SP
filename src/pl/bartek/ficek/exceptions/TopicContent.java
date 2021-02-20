package pl.bartek.ficek.exceptions;

public class TopicContent {

    public static void main(String[] args) {
        /* below throwing an exception */

        TopicContent instance = new TopicContent();
        int numberOfSeconds = 0;
        int hours = -3;

        try {
            numberOfSeconds = instance.getNumberOfSeconds(hours);
            System.out.println("Try message: " + numberOfSeconds);

        } catch (IllegalArgumentException exception) {
            numberOfSeconds = instance.getNumberOfSeconds(-hours);
            System.out.println("Catch message: " + numberOfSeconds);
            exception.printStackTrace();
        } finally {
            System.out.println("Finally message");
        }
        System.out.println("Message after try-catch-finally");


        int numberOfSeconds2 = 0;
        int hours2 = 3;

        numberOfSeconds2 = instance.getNumberOfSeconds(hours2);
        System.out.println("Second call of the method: " + numberOfSeconds2);


    }

    public int getNumberOfSeconds(int hour) {
        if (hour < 0) {
            throw new IllegalArgumentException("Hour must be >= 0: " + hour);
        }
        return hour * 60 * 60;
    }
}
