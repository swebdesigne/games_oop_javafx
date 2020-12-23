package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return  Win.isWin(board);
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(int[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isWin(int[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                if (monoHorizontal(board, cell) || monoVertical(board, row)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
