package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_climbingworm;

import java.util.Scanner;

public class Climbingworm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), h = sc.nextInt();
        int sol = 0;
        int ah = 0;
        while (ah < h) {
            ah += a;
            sol++;
            if (ah >= h) break;
            ah -= b;
        }
        System.out.println(sol);
    }
}
