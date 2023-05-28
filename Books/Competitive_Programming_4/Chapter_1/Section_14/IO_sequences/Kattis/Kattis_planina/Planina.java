package Books.Competitive_Programming_4.Chapter_1.Section_14.IO_sequences.Kattis.Kattis_planina;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sol = (int) (Math.pow(2, n) + 1);
        System.out.println(sol * sol);
    }
}
