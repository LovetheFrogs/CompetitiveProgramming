package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_earlywinter;

import java.util.Scanner;

public class Earlywinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(), c = 0;
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            if (day <= d) break;
            c++;
        }
        if (c != n) System.out.println("It hadn't snowed this early in " + c + " years!");
        else System.out.println("It had never snowed this early!");
    }
}
