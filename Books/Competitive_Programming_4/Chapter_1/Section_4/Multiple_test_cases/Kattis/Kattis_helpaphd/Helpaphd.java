package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_helpaphd;

import java.util.Scanner;

public class Helpaphd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] o = sc.next().split("\\+");
            if (o.length == 1) System.out.println("skipped");
            else System.out.println(Integer.parseInt(o[0]) + Integer.parseInt(o[1]));
        }
    }
}
