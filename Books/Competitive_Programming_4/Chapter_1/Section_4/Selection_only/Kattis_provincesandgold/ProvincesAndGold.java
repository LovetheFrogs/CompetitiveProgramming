package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis_provincesandgold;

import java.util.Scanner;

public class ProvincesAndGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int s = sc.nextInt();
        int c = sc.nextInt();
        int m = (g * 3) + (s * 2) + (c * 1);

        if (m >= 8) System.out.print("Province or ");
        else if (m >= 5) System.out.print("Duchy or ");
        else if (m >= 2) System.out.print("Estate or ");

        if (m >= 6) System.out.println("Gold");
        else if (m >= 3) System.out.println("Silver");
        else System.out.println("Copper");
    }
}
