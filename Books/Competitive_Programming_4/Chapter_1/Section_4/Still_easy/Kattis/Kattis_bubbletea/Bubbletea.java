package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_bubbletea;

import java.util.Scanner;

public class Bubbletea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long minprice = Long.MAX_VALUE;
        int n = sc.nextInt();
        int[] teap = new int[n];
        for (int i = 0; i < n; i++) teap[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] topp = new int[m];
        for (int i = 0; i < m; i++) topp[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int aux = sc.nextInt();
            for (int j = 0; j < aux; j++) {
                int val = sc.nextInt();
                int i1 = teap[i] + topp[val - 1];
                if (i1 < minprice) minprice = i1;
            }
        }
        long mon = sc.nextLong();
        long st = (mon / minprice) - 1;
        System.out.println(st < 0 ? 0 : st);
    }
}
