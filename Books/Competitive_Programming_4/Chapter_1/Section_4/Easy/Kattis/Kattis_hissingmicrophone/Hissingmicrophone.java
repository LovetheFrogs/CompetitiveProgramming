package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_hissingmicrophone;

import java.util.Scanner;

public class Hissingmicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean t = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 's' && s.charAt(i + 1) == 's') {
                System.out.println("hiss");
                t = false;
                break;
            }
        }
        if (t) System.out.println("no hiss");
    }
}
