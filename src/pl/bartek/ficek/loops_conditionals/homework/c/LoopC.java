package pl.bartek.ficek.loops_conditionals.homework.c;

public class LoopC {

    public static void writeNumbers1() {
        for (int i = -9; i <= 40 ; i+=2) {
            System.out.println(i);
        }
    }

    public static void writeNumbers2() {
        for (int i = -10; i <= 40 ; i++) {
            if (i % 2 ==0) continue;
            System.out.println(i);
        }
    }

}