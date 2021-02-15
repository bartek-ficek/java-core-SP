package pl.bartek.ficek.loops_conditionals.homework.f;

public class LoopF {

    public static int sumFromMatrix(int[][] intMatrix) {
        int sum = 0;
        for (int[] intRow : intMatrix) {
            for (int number : intRow) {
                sum += number;
            }
        }
        System.out.println(sum);
        return sum;
    }
}