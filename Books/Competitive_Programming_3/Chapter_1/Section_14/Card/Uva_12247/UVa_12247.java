package Competitive_Programming_3.Chapter_1.Section_14.Card.Uva_12247;

import java.util.Arrays;
import java.util.Scanner;

public class UVa_12247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int son[] = new int[2];
        int d[] = new int[3];
        boolean c[] = new boolean[53];

        while (sc.hasNext()) {
            for (int i = 0; i < 53; i++) {
                c[i] = true;
            }

            d[0] = sc.nextInt();
            d[1] = sc.nextInt();
            d[2] = sc.nextInt();
            son[0] = sc.nextInt();
            son[1] = sc.nextInt();

            if (d[0] + d[1] + d[2] + son[0] + son[1] == 0) break;

            for (int i = 0; i < 3; i++) {
                c[d[i]] = false;
            }
            for (int j = 0; j < 2; j++) {
                c[son[j]] = false;
            }

            Arrays.sort(d);
            Arrays.sort(son);
            int res = 53;

            if (son[0] > d[2]) {
                for (int i = 1; i <= 52 && i < res; i++) {
                    if (c[i]) {
                        res = i;
                    }
                }
            }

            if (son[1] > d[2]) {
                for (int i = d[2] + 1; i <= 52 && i < res; i++) {
                    if (c[i]) {
                        res = i;
                    }
                }
            }

            if (son[0] > d[1]) {
                for (int i = d[1] + 1; i <= 52 && i < res; i++) {
                    if (c[i]) {
                        res = i;
                    }
                }
            }

            if (res == 53) res = -1;

            System.out.println(res);
        }
    }
}
