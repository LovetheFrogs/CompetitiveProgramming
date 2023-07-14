package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_00621;

import java.util.Scanner;

public class UVa_00621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("1") || s.equals("4") || s.equals("78")) System.out.println("+");
            else if (s.charAt(s.length() - 2) == '3' && s.charAt(s.length() - 1) == '5') System.out.println("-");
            else if (s.charAt(s.length() - 1) == '4' && s.charAt(0) == '9') System.out.println("*");
            else System.out.println("?");
        }
    }
}
