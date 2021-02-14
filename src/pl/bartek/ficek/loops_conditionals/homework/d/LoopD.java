package pl.bartek.ficek.loops_conditionals.homework.d;

public class LoopD {

    public static void writeNumbers() {
        int number = -10;
        while (number <= 40) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
