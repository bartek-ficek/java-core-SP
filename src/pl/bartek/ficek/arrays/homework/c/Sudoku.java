package pl.bartek.ficek.arrays.homework.c;

public class Sudoku {

    private final Integer[][] emptyBoard;

    public Sudoku(Integer[][] emptyBoard) {
        this.emptyBoard = emptyBoard;
    }

    public static Integer[][] fillEmptyBoard() {

        Integer[][] sampleBoard = new Integer[][]{};

        sampleBoard[0] = new Integer[]{2, null, null, 6, null, 7, 5, null, null};
        sampleBoard[1] = new Integer[]{null, null, null, null, null, null, null, 9, 6};
        sampleBoard[2] = new Integer[]{6, null, 7, null, null, 1, 3, null, null};

        sampleBoard[3] = new Integer[]{null, 5, null, 7, 3, 2, null, null, null};
        sampleBoard[4] = new Integer[]{null, 7, null, null, null, null, null, 2, null};
        sampleBoard[5] = new Integer[]{null, null, null, 1, 8, 9, null, 7, null};

        sampleBoard[6] = new Integer[]{null, null, 3, 5, null, null, 6, null, 4};
        sampleBoard[7] = new Integer[]{8, 4, null, null, null, null, null, null, null};
        sampleBoard[8] = new Integer[]{null, null, 5, 2, null, 6, null, null, 8};

        return sampleBoard;
    }
}
