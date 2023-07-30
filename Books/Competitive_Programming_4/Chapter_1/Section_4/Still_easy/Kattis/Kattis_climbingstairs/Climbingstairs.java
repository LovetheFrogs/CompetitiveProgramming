package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_climbingstairs;

import java.util.Scanner;

public class Climbingstairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
        System.out.println(Math.max(n, k + Math.abs(r - k)) + r + ((n % 2 != r % 2 && n > (k + Math.abs(k - r))) ? 1 : 0));
    }
}
