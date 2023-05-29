package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis_temperature;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble() - 1;
        if (y < 0.5) {
            if (x == 0) System.out.println("ALL GOOD");
            else System.out.println("IMPOSSIBLE");
        }
        else System.out.println(new DecimalFormat("0.000000000").format(-(x / y)));
    }
}
