package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] board = new String[3][3];

    public TicTacToe(String[][] board) {

        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board [value];
    }

    public String[] getColumn(Integer value) {
        return board [value];
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

        String [] strings = getRow(rowIndex);
        Boolean bool = false;

        if(strings[0].equals(strings[1])&& strings[0].equals(strings[2])) {
            bool = true;
        }

        return bool;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return board;
    }
}

