package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_thanos;

import java.util.Scanner;

public class Thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t;
        long p, r, f;
        for (int i = 0; i < n; i++) {
            t = 0;
            p = sc.nextLong();
            r = sc.nextLong();
            f = sc.nextLong();
            while (p <= f) {
                t++;
                p *= r;
            }
            System.out.println(t);
        }
    }
}
