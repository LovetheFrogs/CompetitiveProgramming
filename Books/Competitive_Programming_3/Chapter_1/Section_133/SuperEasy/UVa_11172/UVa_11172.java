package Books.Competitive_Programming_3.Chapter_1.Section_133.SuperEasy.UVa_11172;

import java.util.Scanner;

public class UVa_11172 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a < b ? "<" : a > b ? ">" : "=");
        }
    }
}
