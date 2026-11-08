package Backtracking;

public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.'; // abhi queens nhi bethi es jgha  pr
            }
        }

        nQueens(board, 0);
        System.out.println("Total Ways "+ count);
    }
    static int count = 0; // no of ways total
    public static void nQueens(char board[][], int row){
        if(board.length == row){
            printBoard(board);
            count++;
            return;
        }
        for(int j = 0; j < board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q'; // har row pe ek queen beetha do
                nQueens(board, row+1);
                board[row][j] = '.'; // backtracking
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        // vertical UP -> same col, diff row -> (i-1, j) -> (i-2, j) ...
        for(int i = row-1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diag left UP -> diff row and diff col -> (i-1, j-1) -> (i-2, j-2) ...
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diag right UP -> diff roow and diff col -> (i-1, j+1) -> (i-2, j+2) ...
        for(int i = row-1, j= col+1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    
    public static void printBoard(char board[][]){
        System.out.println("==Board==");
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
// 1. Place N queens on each row
// 2. check a safe place , is it safe place for queen
