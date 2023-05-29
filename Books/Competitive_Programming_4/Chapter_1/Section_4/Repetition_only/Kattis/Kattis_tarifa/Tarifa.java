package Books.Competitive_Programming_4.Chapter_1.Section_4.Repetition_only.Kattis.Kattis_tarifa;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sol = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sol += x - p;
        }
        System.out.println(sol + x);
    }
}
