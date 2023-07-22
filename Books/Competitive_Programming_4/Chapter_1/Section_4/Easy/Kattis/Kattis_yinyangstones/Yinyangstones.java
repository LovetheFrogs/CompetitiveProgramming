package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_yinyangstones;

import java.util.Scanner;

public class Yinyangstones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = 0, b = 0;
        for (char c : s.toCharArray()) {
            if (c == 'W') w++;
            else b++;
        }
        System.out.println(s.length() % 2 == 0 && b == w ? "1" : "0");
    }
}
