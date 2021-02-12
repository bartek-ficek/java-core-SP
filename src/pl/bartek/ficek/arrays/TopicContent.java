package pl.bartek.ficek.arrays;

import java.util.Arrays;

public class TopicContent {

    public static void main(String[] args) {

        int[]testBoarde = new int[2];
        System.out.println(Arrays.toString(testBoarde)); //tutaj do kazdego elementu tablicy przypisane 0

        System.out.println("**********************");

        int[]testBoard2 = new int[]{};
        System.out.println(testBoard2.length);
        System.out.println(Arrays.toString(testBoard2));

        System.out.println("**********************");

        int board[][] = new int[4][];
//        board[0] = new int[3];
//        board[1] = new int[3];
//        board[2] = new int[3];

        for(int[] cell : board) {
            System.out.println(Arrays.toString(cell)); //tutaj do kazdego wiersza przypisany NULL
        }

        System.out.println("**********************");

        int nextBoard[][] = new int[][] {new int[]{},new int[]{}};
        for(int[] cell : nextBoard) {
            System.out.println(Arrays.toString(cell));
        }
    }
}
