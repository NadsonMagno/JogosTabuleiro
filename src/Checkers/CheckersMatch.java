package Checkers;

import Chess.ChessPiece;
import board.Board;

public class CheckersMatch {
    private Board board;

    public CheckersMatch() {
        board = new Board(8, 8);
    }

    public CheckersPiece[][] getPieces(){
        CheckersPiece [][] matrix = new CheckersPiece[board.getRows()][board.getColoumns()];
        for(int i = 0; i < board.getRows(); i++){
            for(int j= 0; j<board.getColoumns();j++){
                matrix[i][j] = (CheckersPiece) board.getPieses(i, j);
            }
        }
        return matrix;
    }
    

}
