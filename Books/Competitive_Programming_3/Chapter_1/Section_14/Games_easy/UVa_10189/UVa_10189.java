package Books.Competitive_Programming_3.Chapter_1.Section_14.Games_easy.UVa_10189;

import java.util.Scanner;

public class UVa_10189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        int f = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        while (!(n == 0 && m == 0)) {
            f++;
            if (f > 1) System.out.print("\n");
            char field[][] = new char[n][m];
            System.out.println("Field #" + f + ":");
            if (n != 0 && m != 0) {
                for (int i = 0; i < n; i++) {
                    String l = sc.next();
                    for (int j = 0; j < l.length(); j++) {
                        field[i][j] = l.charAt(j);
                    }
                }

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        char c = field[i][j];
                        int count = 0;
                        if (c == '.') {
                            if (i - 1 >= 0 && j - 1 >= 0 && i - 1 < n && j - 1 < m && field[i - 1][j - 1] == '*')
                                count++;
                            if (i - 1 >= 0 && j >= 0 && i - 1 < n && j < m && field[i - 1][j] == '*') count++;
                            if (i - 1 >= 0 && j + 1 >= 0 && i - 1 < n && j + 1 < m && field[i - 1][j + 1] == '*')
                                count++;
                            if (i >= 0 && j - 1 >= 0 && i < n && j - 1 < m && field[i][j - 1] == '*') count++;
                            if (i >= 0 && j + 1 >= 0 && i < n && j + 1 < m && field[i][j + 1] == '*') count++;
                            if (i + 1 >= 0 && j - 1 >= 0 && i + 1 < n && j - 1 < m && field[i + 1][j - 1] == '*')
                                count++;
                            if (i + 1 >= 0 && j >= 0 && i + 1 < n && j < m && field[i + 1][j] == '*') count++;
                            if (i + 1 >= 0 && j + 1 >= 0 && i + 1 < n && j + 1 < m && field[i + 1][j + 1] == '*')
                                count++;
                            System.out.print(count);
                        }
                        if (c == '*') System.out.print("*");
                    }
                    System.out.print("\n");
                }
            }
            n = sc.nextInt();
            m = sc.nextInt();

        }
    }
}