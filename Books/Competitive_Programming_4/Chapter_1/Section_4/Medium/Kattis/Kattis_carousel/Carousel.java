package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_carousel;

import java.util.Scanner;

public class Carousel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt(), m = sc.nextInt();
            if (n == 0 && m == 0) break;
            int tsol = 1, msol = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a <= m && ((double)b / a < (double)msol / tsol || ((double)b / a == (double)msol / tsol && a > tsol))) {
                    tsol = a;
                    msol = b;
                }
            }
            System.out.println(msol < Integer.MAX_VALUE ? "Buy " + tsol + " tickets for $" + msol : "No suitable tickets offered");
        }
    }
}
