package Books.Competitive_Programming_4.Chapter_1.Section_4.IO_sequences.Kattis.Kattis_romans;

import java.util.Scanner;

public class Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println((int) Math.round(x * (1000 * (5280.0/4854.0))));
    }
}
