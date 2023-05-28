package Books.Competitive_Programming_3.Chapter_1.Section_14.Chess.UVa_10284;

import java.util.Scanner;

public class UVA_10284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char board[][] = new char[8][8];
        int atk, i, j;
        while (sc.hasNext()) {
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    board[i][j] = '*';
                }
            }

            String l = sc.next();
            atk = 0;
            i = 0;
            j = 0;

            // build the board
            for (int y = 0; y < l.length(); y++) {
                char c = l.charAt(y);
                if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '/') {
                    if (c == 'p' || c == 'P') board[i][j] = c;
                    else board[i][j] = Character.toLowerCase(c);
                    j++;
                } else if (c == '/') {
                    i++;
                    j = 0;
                }
                else {
                    for (int o = 0; o < Character.getNumericValue(c); o++) {
                        board[i][j] = '*';
                        j++;
                    }
                }
            }

            // Get free cells
            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    char p = board[i][j];
                    if (p == '*' || p == '_') {  }
                    else if (p == 'p' || p == 'P') atk_pawn(board, i, j, p);
                    else if (p == 'n') atk_night(board, i, j);
                    else if (p == 'b') atk_bishop(board, i, j);
                    else if (p == 'r') atk_rook(board, i, j);
                    else if (p == 'k') atk_king(board, i, j);
                    else if (p == 'q') {
                        atk_bishop(board, i, j);
                        atk_rook(board, i, j);
                    }
                }
            }

            for (i = 0; i < 8; i++) {
                for (j = 0; j < 8; j++) {
                    if (board[i][j] == '*') atk++;
                }
            }

            System.out.println(atk);
        }
    }

    private static void atk_king(char[][] board, int i, int j) {
        for (int m = i - 1; m <= i + 1; m++) {
            if (m > 7 || m < 0) continue;
            for (int n = j - 1; n <= j + 1; n++) {
                if (n > 7 || n < 0) {  }
                else if (board[m][n] == '*') board[m][n] = '_';
            }
        }
    }

    private static void atk_rook(char[][] board, int i, int j) {
        for (int m = i + 1; m < 8; m++) {
            if (board[m][j] == '*') board[m][j] = '_';
            else if (board[m][j] == '_') continue;
            else break;
        }
        for (int m = i - 1; m >= 0; m--) {
            if (board[m][j] == '*') board[m][j] = '_';
            else if (board[m][j] == '_') continue;
            else break;
        }

        for (int n = j + 1; n < 8; n++) {
            if (board[i][n] == '*') board[i][n] = '_';
            else if (board[i][n] == '_') continue;
            else break;
        }
        for (int n = j - 1; n >= 0; n--) {
            if (board[i][n] == '*') board[i][n] = '_';
            else if (board[i][n] == '_') continue;
            else break;
        }
    }

    private static void atk_bishop(char[][] board, int i, int j) {
        int c = 1;
        for (int m = i - 1; m >= 0; m--) {
            int n = j - (1 * c);
            if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') {
                board[m][n] = '_';
                c++;
            }
            else if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '_') {
                c++;
                continue;
            }
            else break;
        }

        c = 1;
        for (int m = i + 1; m < 8; m++) {
            int n = j + (1 * c);
            if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') {
                board[m][n] = '_';
                c++;
            }
            else if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '_') {
                c++;
                continue;
            }
            else break;
        }

        c = 1;
        for (int n = j - 1; n >= 0; n--) {
            int m = i + (1 * c);
            if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') {
                board[m][n] = '_';
                c++;
            }
            else if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '_') {
                c++;
                continue;
            }
            else break;
        }

        c = 1;
        for (int n = j + 1; n < 8; n++) {
            int m = i - (1 * c);
            if (n >= 0 && n < 8 && m >= 0 && m < 8 && n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') {
                board[m][n] = '_';
                c++;
            }
            else if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '_') {
                c++;
                continue;
            }
            else break;
        }
    }

    private static void atk_night(char[][] board, int i, int j) {
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

        for (int k = 0; k < 8; k++) {

            int x = i + X[k];
            int y = j + Y[k];

            if (x >= 0 && x <= 7 && y >= 0 && y <= 7 && board[x][y] == '*') board[x][y] = '_';;
        }
    }

    private static void atk_pawn(char[][] board, int i, int j, char p) {
        int m;
        int n;

        n = j - 1;
        if (p == 'p') m = i + 1;
        else m = i - 1;
        if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') board[m][n] = '_';;

        n = j + 1;
        if (n >= 0 && n < 8 && m >= 0 && m < 8 && board[m][n] == '*') board[m][n] = '_';;
    }
}
