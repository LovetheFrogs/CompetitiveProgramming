package Books.Competitive_Programming_4.Chapter_1.Section_4.Repetition_only.Kattis.Kattis_qaly;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Qaly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sol = 0;
        for (int i = 0; i < n; i++) {
            double q = sc.nextDouble();
            double y = sc.nextDouble();
            sol += q * y;
        }
        System.out.println(new DecimalFormat("#0.000").format(sol));
    }
}
