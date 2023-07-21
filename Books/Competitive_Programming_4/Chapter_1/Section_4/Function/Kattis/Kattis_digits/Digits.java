package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_digits;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String l = sc.next();
            if (l.equals("END")) break;
            else if (l.equals("1")) System.out.println(1);
            else {
                int i = 2;
                int prev = l.length();
                int cur = (int) Math.log10(prev) + 1;
                while (cur != prev) {
                    prev = cur;
                    cur = (int) Math.log10(prev) + 1;
                    i++;
                }
                System.out.println(i);
            }
        }
    }
}
