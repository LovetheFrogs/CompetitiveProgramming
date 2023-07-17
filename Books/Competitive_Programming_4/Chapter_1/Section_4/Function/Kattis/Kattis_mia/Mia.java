package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_mia;

import java.util.Scanner;

public class Mia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (a == 0) break;
            int p1 = score(a, b);
            int p2 = score(c, d);
            if (p1 == p2) System.out.println("Tie.");
            else if (p1 > p2) System.out.println("Player 1 wins.");
            else System.out.println("Player 2 wins.");
        }
    }

    static int score(int a, int b) {
        if (b > a) {
            int aux = a;
            a = b;
            b = aux;
        }
        int s = a * 10 + b;
        if (s == 21) s = 10000;
        if (a == b) s *= 100;
        return s;
    }
}
