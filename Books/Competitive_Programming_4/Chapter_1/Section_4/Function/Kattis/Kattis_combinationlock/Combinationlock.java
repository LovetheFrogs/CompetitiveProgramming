package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_combinationlock;

import java.util.Scanner;

public class Combinationlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        while (s != 0 || a != 0 || b != 0 || c != 0) {
            int sol = 120;
            sol += ((s += a > s ? 40 : 0) - a);
            sol += (b - (a -= a > b ? 40 : 0));
            sol += ((b += c > b ? 40 : 0) - c);
            System.out.println(sol * 9);
            s = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
        }
    }
}
