package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_driversdilemma;

import java.util.Scanner;

public class Driversdilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double x = sc.nextDouble();
        double m = sc.nextDouble(), f;
        int res = -1, s;
        for (int i = 0; i < 6; i++) {
            s = sc.nextInt();
            f = sc.nextDouble();
            if ((m / s) * (x + s / f) <= c / 2.0) res = Math.max(res, s);
        }
        System.out.println((res < 0) ? "NO" : ("YES " + res));
    }
}
