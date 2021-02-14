package pl.bartek.ficek.loops_conditionals.homework.e;

public class LoopE {

    public static int sumFromArray(int[] intArray) {
        int sum = 0;
        for (int number : intArray) {
            sum +=number;
        }
        System.out.println(sum);
        return sum;
    }
}
