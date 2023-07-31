package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_battlesimulation;

import java.util.Scanner;

public class Battlesimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2)) {
                System.out.print("C");
                i += 2;
            } else if (s.charAt(i) == 'R') System.out.print("S");
            else if (s.charAt(i) == 'B') System.out.print("K");
            else if (s.charAt(i) == 'L') System.out.print("H");
        }
    }
}
