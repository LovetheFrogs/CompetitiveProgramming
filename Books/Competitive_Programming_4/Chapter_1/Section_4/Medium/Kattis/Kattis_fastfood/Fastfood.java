package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_fastfood;

import java.util.Scanner;

public class Fastfood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        for (int c = 0; c < tc; c++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt() + 1;
            int[] have = new int[m];
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                int t = scanner.nextInt() + 1;
                for (int j = 1; j < t; j++) {
                    grid[i][scanner.nextInt()] = 1;
                }
                grid[i][0] = scanner.nextInt();
            }
            for (int i = 1; i < m; i++) {
                have[i] = scanner.nextInt();
            }
            int max = 0;
            for (int j = 0; j < n; j++) {
                int min = 100;
                for (int k = 1; k < m; k++) {
                    if (grid[j][k] == 1 && min > have[k]) {
                        min = have[k];
                    }
                }
                max += min * grid[j][0];
            }
            System.out.println(max);
        }
    }
}
