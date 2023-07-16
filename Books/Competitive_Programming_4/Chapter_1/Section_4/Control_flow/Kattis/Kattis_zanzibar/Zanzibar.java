package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_zanzibar;

import java.util.Scanner;

public class Zanzibar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), s;
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            s = 0;
            String[] line = sc.nextLine().split(" ");
            int[] n = new int[line.length];
            for (int j = 0; j < line.length; j++) n[j] = Integer.parseInt(line[j]);
            for (int j = 1; j < n.length; j++) if (n[j] > n[j - 1] * 2) s += Math.abs((n[j - 1] * 2) - n[j]);
            System.out.println(s);
        }
    }
}
