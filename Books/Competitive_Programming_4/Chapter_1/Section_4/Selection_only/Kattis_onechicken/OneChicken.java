package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis_onechicken;

import java.util.Scanner;

public class OneChicken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m > n && m - n > 1) System.out.println("Dr. Chaz will have " + (m - n) + " pieces of chicken left over!");
        else if (m > n && m - n == 1) System.out.println("Dr. Chaz will have " + (m - n) + " piece of chicken left over!");
        else if (m < n  && n - m > 1) System.out.println("Dr. Chaz needs " + (n - m) + " more pieces of chicken!");
        else System.out.println("Dr. Chaz needs " + (n - m) + " more piece of chicken!");
    }
}
