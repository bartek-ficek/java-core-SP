package pl.bartek.ficek.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[]testBoarde = new int[2];
        System.out.println(Arrays.toString(testBoarde)); //tutaj do kazdego elementu tablicy przypisane 0


        int board[][] = new int[4][];
//        board[0] = new int[3];
//        board[1] = new int[3];
//        board[2] = new int[3];

        for(int[] cell : board) {
            System.out.println(Arrays.toString(cell)); //tutaj do kazdego wiersza przypisany NULL
        }
    }
}
