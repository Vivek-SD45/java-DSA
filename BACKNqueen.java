public class BACKNqueen {

    public static void nQueen(char board[][], int row) {
        if (row == board.length) {
            printboard(board);
            return;

        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';
            nQueen(board, row + 1);


            board[row][j] = 'x';

        }

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
        int n = 2;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';

            }

        }
        nQueen(board, 0);

    }

}
