package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis.Kattis_moscowdream;

import java.util.Scanner;

public class MoscowDream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if (n < 3 || a + b + c < n) System.out.println("NO");
        else if (a >= 1 && b >= 1 && c >= 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
