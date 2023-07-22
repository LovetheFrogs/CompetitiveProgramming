package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_sevenwonders;

import java.util.Scanner;

public class Sevenwonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0, c = 0, g = 0;
        String s = sc.next();
        for (char f : s.toCharArray()) {
            if (f == 'T') t++;
            else if (f == 'C') c++;
            else g++;
        }
        System.out.println((int)(Math.pow(t, 2) + Math.pow(c, 2) + Math.pow(g, 2)) + 7 * Math.min(t, Math.min(c, g)));
    }
}
