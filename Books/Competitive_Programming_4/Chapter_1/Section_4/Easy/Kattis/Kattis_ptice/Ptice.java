package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_ptice;

import java.util.Scanner;

public class Ptice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = "ABC";
        String B = "BABC";
        String G = "CCAABB";
        int a = 0, b = 0, g = 0;
        String s = sc.next();
        for (int i = 0; i < n; i++) {
            char aux = s.charAt(i);
            if (aux == A.charAt(i % 3)) a++;
            if (aux == B.charAt(i % 4)) b++;
            if (aux == G.charAt(i % 6)) g++;
        }
        int max = Math.max(a, Math.max(b, g));
        System.out.println(max);
        System.out.print(a == max ? "Adrian\n" : "");
        System.out.print(b == max ? "Bruno\n" : "");
        System.out.print(g == max ? "Goran\n" : "");
    }
}
