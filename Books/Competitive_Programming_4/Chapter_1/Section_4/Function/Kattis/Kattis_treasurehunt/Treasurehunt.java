package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_treasurehunt;

import java.util.Scanner;

public class Treasurehunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }
        int i = 0;
        int j = 0;
        int s = 0;
        while (true) {
            if (j >= n || j < 0 || i >= m || i < 0) {
                System.out.println("Out");
                break;
            }
            else if (s > n * m * 2) {
                System.out.println("Lost");
                break;
            }
            else if (map[i][j] == 'N') i--;
            else if (map[i][j] == 'S') i++;
            else if (map[i][j] == 'W') j--;
            else if (map[i][j] == 'E') j++;
            else if (map[i][j] == 'T') {
                System.out.println(s);
                break;
            }
            s++;
        }
    }
}
