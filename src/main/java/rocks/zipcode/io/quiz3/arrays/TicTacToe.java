package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private final String[][] board; //= new String[3][3];

    public TicTacToe(String[][] board) {

        this.board = board;
    }

    public TicTacToe() {

        this(new String[3][3]);
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

//        String firstElement = board[value][0];
//        String secondElement = board[value][1];
//        String thirdElement = board[value][2];
//
//        String [] column = {firstElement, secondElement, thirdElement};
//        return column;
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
                winner = column[i];
            }
            else if(isRowHomogenous(i)){
                String []row = getRow(i);
                winner = row[i];
            }

        }
        return winner;
    }

    public String[][] getBoard() {
        return board;
    }
}

