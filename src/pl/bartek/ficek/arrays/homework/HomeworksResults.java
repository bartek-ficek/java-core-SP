package pl.bartek.ficek.arrays.homework;

import pl.bartek.ficek.arrays.homework.a.MyArray;

public class HomeworksResults {

    public static void main(String[] args) {

        //Exercise 1 Solution:
        MyArray myArray = new MyArray();
        int[]numbers = new int[] {-2,3};
        int sum = myArray.sumOfArrayElements(numbers);
        System.out.println(sum);
    }
}
