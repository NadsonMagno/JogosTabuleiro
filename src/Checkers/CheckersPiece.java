package Checkers;

import board.Board;
import board.Piece;

public class CheckersPiece extends Piece {
    private ColorCheckers color;

    public CheckersPiece(Board board, ColorCheckers color) {
        super(board);
        this.color = color;
    }

    public ColorCheckers getColor() {
        return color;
    }
    
}
