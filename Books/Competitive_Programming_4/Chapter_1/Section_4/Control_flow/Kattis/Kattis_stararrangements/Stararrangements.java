package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_stararrangements;

import java.util.Scanner;

public class Stararrangements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        System.out.println((int) s + ":");
        for (int x = 2; x < Math.round(s / 2) + 1; x++) {
            int y = x - 1;
            if (s % (x + y) == x || s % (x + y) == 0) System.out.println(x + "," + y);
            if (s % x == 0) System.out.println(x + "," + x);
        }
    }
}
