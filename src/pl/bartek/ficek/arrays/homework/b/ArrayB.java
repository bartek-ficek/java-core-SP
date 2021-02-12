package pl.bartek.ficek.arrays.homework.b;

public class ArrayB {

    public int greatestValue(int[] threeElementsArray) {
        int greatestValue=threeElementsArray[0];

        if (threeElementsArray[1]>greatestValue){
            greatestValue=threeElementsArray[1];
        }

        if (threeElementsArray[2]>greatestValue){
            greatestValue=threeElementsArray[2];
        }
        return greatestValue;
    }

    public int greatestValueNoIf(int[] threeElementsArray) {
        return Math.max(threeElementsArray[0],Math.max(threeElementsArray[1],threeElementsArray[2]));
    }
}
