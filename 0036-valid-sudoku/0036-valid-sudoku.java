import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check 3x3 sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkBox(board, i, j)) return false;
            }
        }

        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (!checkRow(board, i) || !checkCol(board, i)) return false;
        }

        return true;
    }

    public boolean checkBox(char[][] board, int startRow, int startCol) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char val = board[i][j];
                if (val != '.') {
                    if (seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int row) {
        HashSet<Character> seen = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            char val = board[row][j];
            if (val != '.') {
                if (seen.contains(val)) return false;
                seen.add(val);
            }
        }
        return true;
    }

    public boolean checkCol(char[][] board, int col) {
        HashSet<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char val = board[i][col];
            if (val != '.') {
                if (seen.contains(val)) return false;
                seen.add(val);
            }
        }
        return true;
    }
}
