package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_bitsequalizer;

import java.util.Scanner;

public class Bitsequalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            System.out.print("Case " + (i + 1) + ": ");
            String s = sc.next();
            String t = sc.next();
            int d = 0, od = 0, n1 = 0, n2 = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != t.charAt(j)) d++;
                if (s.charAt(j) == '?' && t.charAt(j) == '1') od--;
                else if (s.charAt(j) == '0' && t.charAt(j) == '1') {
                    n2++;
                    od--;
                } else if (s.charAt(j) == '1' && t.charAt(j) == '0') {
                    n1++;
                    od++;
                }
            }
            if (od > 0) System.out.println(-1);
            else System.out.println(d - Math.min(n1, n2));
        }
    }
}
