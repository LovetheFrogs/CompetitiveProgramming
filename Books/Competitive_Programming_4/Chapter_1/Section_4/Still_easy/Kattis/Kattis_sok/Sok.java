package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_sok;

import java.util.Scanner;

public class Sok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble(), i = sc.nextDouble(), j = sc.nextDouble(), k = sc.nextDouble();
        double m = Math.min(a / i, Math.min(b / j, c / k));
        System.out.println((a - i * m) + " " + (b - j * m) + " " + (c - k * m));
    }
}
