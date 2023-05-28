package Books.Competitive_Programming_3.Chapter_1.Section_14.Card.UVa_10646;

import java.util.Scanner;

public class UVa_10646 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String[] s = new String[52];
            for (int j = 0; j < 52; j++) {
                s[j] = sc.next();
            }
            System.out.println(new StringBuilder().append("Case ").append(i).append(": ").append(s[32]));
        }
    }
}
