package Competitive_Programming_3.Chapter_1.Section_133.Easy.UVa_11799;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int max = 0;
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int s = sc.nextInt();
                if (s > max) max = s;
            }
            System.out.println(new StringBuilder().append("Case ").append(i + 1).append(": ").append(max).toString());
        }
    }
}
