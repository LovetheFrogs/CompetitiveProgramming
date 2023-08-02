package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_shatteredcake;

import java.util.Scanner;

public class Shatteredcake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), n = sc.nextInt();
        int aux = 0;
        for (int i = 0; i < n; i++) aux += sc.nextInt() * sc.nextInt();
        System.out.println(aux / w);
    }
}
