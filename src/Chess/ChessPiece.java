package Chess;

import board.Board;
import board.Piece;

public class ChessPiece extends Piece{
    private ColorChess color;
 
    public ChessPiece(Board board, ColorChess color) {
        super(board);
        this.color = color;
    }

    public ColorChess getColor() {
        return color;
    }
    
}
