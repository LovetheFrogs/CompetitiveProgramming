package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_speedlimit;

import java.util.Scanner;

public class Speedlimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m, t, s, pt;
        while (true) {
            m = 0;
            pt = 0;
            for (int i = 0; i < n; i++) {
                s = sc.nextInt();
                t = sc.nextInt();
                m += (s * (t - pt));
                pt = t;
            }
            n = sc.nextInt();
            System.out.println(m + " miles");
            if (n == -1) break;
        }
    }
}
