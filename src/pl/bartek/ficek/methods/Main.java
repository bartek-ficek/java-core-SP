package pl.bartek.ficek.methods;

import pl.bartek.ficek.methods.homework.Temperature;

public class Main {

    public static void main(String[] args) {

        int negativeTemperature = -15;
        int positiveTemperature = 15;

        Temperature.isPositive(negativeTemperature);
        Temperature.isPositive(positiveTemperature);
    }
}