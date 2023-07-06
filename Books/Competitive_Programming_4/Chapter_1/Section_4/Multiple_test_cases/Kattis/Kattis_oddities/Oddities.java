package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_oddities;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) System.out.println(x + " is even");
            else System.out.println(x + " is odd");
        }
    }
}
