public class BACKNNqueen

{

    public static void nnQueen(char board[][], int row) {
        if (row == board.length) {
            printboard(board);
            return;

        }

        // column loop
        for (int j = 0; j < board.length; j++) {
           if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nnQueen(board, row + 1);//functio call 

            board[row][j] = 'x';//backtracking step

           }

        }

    }

    public static boolean isSafe(char board[][],  int row, int col){
//vertical up cheacking
for(int i =row-1; i>=0; i--){

if(board[i][col]=='Q'){

    return false;
}
}
//diagonal left up
for( int i=row-1, j=col-1; i>=0 && j>=0; j--){
if(board[i][j]=='Q'){
    return false;
}

}
//diagonal right up
for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){

if(board[i][j]=='Q'){
    return false;
}
}
return true;
        }

    public static void printboard(char board[][]) {
        System.out.println("----------------------chessboard---------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';

            }

        }
        nnQueen(board, 0);

    }

}
