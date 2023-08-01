package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_anotherbrick;

import java.util.Scanner;

public class Anotherbrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        int p = 0;
        boolean f = true;
        for (int a : b) {
            if ((p + a) <= w) {
                p += a;
                if (p == w) p = 0;
            }
            else {
                f = false;
                break;
            }
        }
        System.out.println(f ? "YES" : "NO");
    }
}
