package pl.bartek.ficek.arrays.homework.d;

public class ChestBoard {

    private Piece[][] board;

    public ChestBoard(Piece[][] board) {
        this.board = board;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public static ChestBoard fillByKasparovFinalState() {
        Piece[][] finalState = new Piece[8][8];

        finalState[0] = new Piece[] {Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY,
                Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};
        finalState[1] = new Piece[] {Piece.B_PAWN, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY,
                Piece.EMPTY, Piece.EMPTY, Piece.W_PAWN, Piece.EMPTY};
        finalState[2] = new Piece[] {Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY,
                Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};
        finalState[3] = new Piece[] {Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY,
                Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};
        finalState[4] = new Piece[] {Piece.EMPTY, Piece.B_KING, Piece.B_PAWN, Piece.EMPTY,
                Piece.EMPTY, Piece.W_KNIGHT, Piece.EMPTY, Piece.EMPTY};
        finalState[5] = new Piece[] {Piece.EMPTY, Piece.B_KNIGHT, Piece.EMPTY, Piece.EMPTY,
                Piece.W_ROOK, Piece.EMPTY, Piece.W_PAWN, Piece.EMPTY};
        finalState[6] = new Piece[] {Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.B_ROOK,
                Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};
        finalState[7] = new Piece[] {Piece.EMPTY, Piece.W_KING, Piece.EMPTY, Piece.EMPTY,
                Piece.EMPTY, Piece.EMPTY, Piece.EMPTY, Piece.EMPTY};

        return new ChestBoard(finalState);
    }
}