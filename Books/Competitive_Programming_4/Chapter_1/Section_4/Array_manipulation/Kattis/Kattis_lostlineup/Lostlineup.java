package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_lostlineup;

import java.util.Scanner;

public class Lostlineup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        l[0] = 1;
        for (int i = 1; i < n; i++) {
            int aux = sc.nextInt();
            l[aux + 1] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) System.out.print(l[i]);
            else System.out.print(l[i] + " ");
        }
    }
}
