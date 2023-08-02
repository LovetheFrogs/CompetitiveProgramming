package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_cowcrane;

import java.util.Scanner;

public class Cowcrane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), l = sc.nextInt();
        int M = sc.nextInt(), L = sc.nextInt();
        int tm = sc.nextInt(), tl = sc.nextInt();
        int aux = 0;
        if (Math.abs(aux - m) + Math.abs(m - M) <= tm && Math.abs(aux - m) + Math.abs(m - M) + Math.abs(M - l) + Math.abs(l - L) <= tl) System.out.println("possible");
        else if (Math.abs(aux - l) + Math.abs(l - L) <= tl && Math.abs(aux - l) + Math.abs(l - L) + Math.abs(L - m) + Math.abs(m - M) <= tm) System.out.println("possible");
        else if (Math.abs(aux - m) + Math.abs(m - l) + Math.abs(l - L) <= tl && Math.abs(aux - m) + Math.abs(m - l) + Math.abs(l - L) + Math.abs(L - l) + Math.abs(l - M) <= tm) System.out.println("possible");
        else if (Math.abs(aux - l) + Math.abs(l - m) + Math.abs(m - M) <= tm && Math.abs(aux - l) + Math.abs(l - m) + Math.abs(m - M) + Math.abs(M - m) + Math.abs(m - L) <= tl) System.out.println("possible");
        else System.out.println("impossible");
    }
}
