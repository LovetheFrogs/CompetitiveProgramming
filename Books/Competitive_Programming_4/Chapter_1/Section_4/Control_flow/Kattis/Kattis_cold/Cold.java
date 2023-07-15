package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_cold;

import java.util.Scanner;

public class Cold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0;
        for (int i = 0; i < n; i++) s = sc.nextInt() < 0 ? s + 1 : s + 0;
        System.out.println(s);
    }
}
