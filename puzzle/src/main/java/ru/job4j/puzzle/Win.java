package ru.job4j.puzzle;

public class Win {
    public static boolean horisontally(int[][] board, int row) {
        boolean rsl = true;
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] != 1) {
               rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean  vertical(int[][] board, int cell) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][cell] != 1) {
                rsl = false;
                break;
            }
        }
            return rsl;
    }

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && vertical(board, i) || horisontally(board, i)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
