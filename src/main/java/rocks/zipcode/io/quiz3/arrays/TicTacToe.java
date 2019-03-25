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
        String[] column = new String[board[0].length];
        for(int i=0; i<column.length; i++){
            column[i] = board[i][value];
        }
        return column;

        //return board [value];
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

        String [] column = getColumn(columnIndex);
        Boolean bool = false;

        if(column[0].equals(column[1])&& column[0].equals(column[2])) {
            bool = true;
        }

        return bool;
    }

    public String getWinner() {
        String winner = "X";
        for(int i=0;i<3;i++) {
            if (isColumnHomogeneous(i)){
               String [] column = getColumn(i);
                winner = column[i].toString();
            }
            else if(isRowHomogenous(i)){
                String []row = getRow(i);
                winner = row[i].toString();
            }

        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}

