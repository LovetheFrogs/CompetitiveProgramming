package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_leftbeehind;

import java.util.Scanner;

public class Leftbeehind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        while (a != 0 || b != 0) {
            if (a + b == 13) System.out.println("Never speak again.");
            else if (a > b) System.out.println("To the convention.");
            else if (a == b) System.out.println("Undecided.");
            else if (a < b) System.out.println("Left beehind.");
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
