package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_nastyhacks;

import java.util.Scanner;

public class Nastyhacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            if (e - c > r) System.out.println("advertise");
            else if (e - c == r) System.out.println("does not matter");
            else System.out.println("do not advertise");
        }
    }
}
