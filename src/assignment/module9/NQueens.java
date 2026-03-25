package assignment.module9;

// LeetCode 51 - N Queens
import java.util.*;

public class NQueens {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board)
            Arrays.fill(row, '.');
        backtrack(res, board, 0);
        return res;
    }
    private static void backtrack(List<List<String>> res, char[][] board, int row) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board)
                temp.add(new String(r));
            res.add(temp);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                backtrack(res, board, row + 1);
                board[row][col] = '.';
            }
        }
    }
    private static boolean isSafe(char[][] board, int r, int c) {
        for (int i = 0; i < r; i++)
            if (board[i][c] == 'Q') return false;
        for (int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;
        for (int i = r - 1, j = c + 1; i >= 0 && j < board.length; i--, j++)
            if (board[i][j] == 'Q') return false;
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> result = solveNQueens(n);
        for (List<String> board : result) {
            System.out.println("Solution:");
            for (String row : board)
                System.out.println(row);
            System.out.println();
        }
    }
}
