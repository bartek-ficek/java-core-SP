package pl.bartek.ficek.methods.homework;

public class Temperature {

    public static boolean isPositive(int temperature) {

        boolean isPositive = temperature > 0;

        if (isPositive) {
            System.out.println("Temperature " + temperature + " is positive!");
        }

        else System.out.println(("Temperature " + temperature + " isn't positive!"));

        return isPositive;
    }
}
