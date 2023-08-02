package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_bottledup;

import java.util.Scanner;

public class Bottledup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), v1 = sc.nextInt(), v2 = sc.nextInt(), sol;
        for (sol = s / v1; (s - (sol * v1)) % v2 != 0; sol --) {
            if (sol == -1) break;
        }
        System.out.println(sol == -1 ? "Impossible" : (sol + " " + (s - (sol * v1)) / v2));
    }
}
