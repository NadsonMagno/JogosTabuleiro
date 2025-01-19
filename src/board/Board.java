package board;

public class Board {
    private int rows;
    private int coloumns;
    private Piece[][] pieses;
    public Board(int rows, int coloumns) {
        this.rows = rows;
        this.coloumns = coloumns;
    }
    public int getRows() {
        return rows;
    }
    public int getColoumns() {
        return coloumns;
    }
    public Piece getPieses(int row, int coloumn) {
        return pieses[row][coloumn];
    }
 



}
