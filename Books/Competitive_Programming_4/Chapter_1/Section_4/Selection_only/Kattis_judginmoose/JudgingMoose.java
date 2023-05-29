package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis_judginmoose;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (l == r && l + r != 0) System.out.println("Even " + (l * 2));
        else if (l + r != 0) System.out.println("Odd " + (Math.max(l, r) * 2));
        else System.out.println("Not a moose");
    }
}
