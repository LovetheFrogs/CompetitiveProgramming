package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_11723;

import java.util.Scanner;

public class UVa_11723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, n;
        int i = 1;
        r = sc.nextInt();
        n = sc.nextInt();
        while (r != 0 || n != 0) {
            if (r / n > 26) System.out.println(new StringBuilder().append("Case ").append(i++).append(": impossible"));
            else System.out.println(new StringBuilder().append("Case ").append(i++).append(": ").append((r - 1) / n));
            r = sc.nextInt();
            n = sc.nextInt();
        }
    }
}
