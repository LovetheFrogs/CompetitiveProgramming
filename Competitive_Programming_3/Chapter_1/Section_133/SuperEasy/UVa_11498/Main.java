package Competitive_Programming_3.Chapter_1.Section_133.SuperEasy.UVa_11498;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k != 0) {
            int diva = sc.nextInt(), divb = sc.nextInt();
            for (int i = 0; i < k; i++) {
                int a = sc.nextInt(), b = sc.nextInt();
                if (a < diva) {
                    if (b < divb) System.out.println("SO");
                    else if (b > divb) System.out.println("NO");
                } else if (a > diva) {
                    if (b < divb) System.out.println("SE");
                    else if (b > divb) System.out.println("NE");
                }
                if (b == divb || a == diva) System.out.println("divisa");
            }
            k = sc.nextInt();
        }
    }
}
