package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_oddgnome;

import java.util.Scanner;

public class Oddgnome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = -1, n, g, c;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            g = sc.nextInt();
            for (int j = 0; j < g; j++) {
                c = sc.nextInt();
                if (j == 0) p = c;
                else if (c != p + 1) System.out.println(j + 1);
                else p = c;
            }
        }
    }
}
