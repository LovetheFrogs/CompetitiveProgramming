package Books.Competitive_Programming_4.Chapter_1.Section_4.Selection_only.Kattis_isithalloween;

import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        int d = sc.nextInt();
        if ((m.equals("OCT") && d == 31) || (m.equals("DEC") && d == 25)) System.out.println("yup");
        else System.out.println("nope");
    }
}
