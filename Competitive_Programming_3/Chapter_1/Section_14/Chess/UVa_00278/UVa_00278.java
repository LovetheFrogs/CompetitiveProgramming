package Competitive_Programming_3.Chapter_1.Section_14.Chess.UVa_00278;

import java.util.Scanner;

public class UVa_00278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p;
        int m, n;
        for (int i = 0; i < t; i++) {
            p = sc.next();
            m = sc.nextInt();
            n = sc.nextInt();
            int res = -1;
            if (p.equals("r") || p.equals("Q")) {
                if (m < n) {
                    System.out.println(m);
                } else {
                    System.out.println(n);
                }
            } else if (p.equals("k")) System.out.println(((m + 1) / 2) * ((n + 1) / 2) + (m / 2) * (n / 2));
            else System.out.println(((m + 1) / 2) * ((n + 1) / 2));
        }
    }
}
