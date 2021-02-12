package pl.bartek.ficek.arrays.homework;

import pl.bartek.ficek.arrays.homework.a.ArrayA;
import pl.bartek.ficek.arrays.homework.b.ArrayB;

public class HomeworksResults {

    private static final String BREAKER = "**********************";

    public static void main(String[] args) {

        //Exercise a Solution:
        ArrayA arrayA = new ArrayA();
        int[]numbers = new int[] {-2,3};
        int sum = arrayA.sumOfArrayElements(numbers);
        System.out.println(sum);

        System.out.println(BREAKER);

        //Exercise b Solution FIRST WAY:
        ArrayB arrayB = new ArrayB();
        int[]exampleArray = new int[] {3,9,7};
        int resultB1=arrayB.greatestValue(exampleArray);
        System.out.println(resultB1);

        System.out.println(BREAKER);

        //Exercise b Solution SECOND WAY:
        int resultB2=arrayB.greatestValueNoIf(exampleArray);
        System.out.println(resultB2);

    }
}
