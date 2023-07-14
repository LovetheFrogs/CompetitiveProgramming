package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_numberfun;

import java.util.Scanner;

public class Numberfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            if (a + b == c || a - b == c || b - a == c || a * b == c || a / b == c || b / a == c) System.out.println("Possible");
            else System.out.println("Impossible");
        }
    }
}
