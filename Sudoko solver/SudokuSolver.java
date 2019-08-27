//Solving sudoku board using backtracking algorithm

public class SudokuSolver{

    private int[][] board;
    private boolean previouseFail;

    public SudokuSolver(int[][] board){//Constructor
        this.board=board;
        previouseFail=false;
    }

    public boolean solve (){
        for(int i=0;i<board.length;i++){//Row
            for(int j=0;j<board[i].length;j++){//Elements of the row
                if(board[i][j]==0){// If cell is empty
                    for(int k=1;k<=9;k++){//Try posible combinatios
                        if(isOk(i,j,k)){
                            board[i][j]=k;
                            if(solve())
                                return true;
                            else
                                board[i][j]=0;
                        }

                    }
                    return false;
                }

            }
        }
        return true;
    }

    //check if a possible number is already in a row
    private boolean isInRow(int row, int number) {
        for(int i=0;i<9;i++){
            if(board[row][i]==number){
                return true;
            }
        }
        return false;
    }

    //check if a possible number is already in a column
    private boolean isInCol(int col, int number) {
        for(int i=0;i<9;i++){
            if(board[i][col]==number) {
                return true;
            }
        }
        return false;
    }

    //check if a possible number is in its 3x3 box
    private boolean isInBox(int row, int col, int number) {
        int rowCount;
        int colCount;
        if(row<3){
            rowCount=0;
        }
        else if(row>=3 && row<6){
            rowCount=3;
        }
        else{
            rowCount=6;
        }
        if(col<3){
            colCount=0;
        }
        else if(col>=3 && col<6){
            colCount=3;
        }
        else{
            colCount=6;
        }
        int found=0;
        for(int i=rowCount;i<=(rowCount+2);i++){//For row i go trough 3 elements of it
            for(int j=colCount;j<=(colCount+2);j++){
                if(board[i][j]==number){
                    return true;
                }
            }
        }

        return false;
    }

    // a combined method to check if a number possible to a row,col position is ok
    private boolean isOk(int row, int col, int number) {
        return !isInRow(row, number)  &&  !isInCol(col, number)  &&  !isInBox(row, col, number);
    }

    public String toString(){
        String returnValue="";
        for(int i=0;i<board.length;i++){
            returnValue+="{";
            for(int j=0;j<board[i].length;j++){
                if(j<board[i].length-1){
                    returnValue+=board[i][j] + ",";
                }
                else{
                    returnValue+=board[i][j] + "}";
                }
            }
            returnValue+="\n";
        }
        return returnValue;
    }


}

