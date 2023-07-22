package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_basketballoneonone;

import java.util.Scanner;

public class Basketballoneonone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') a += s.charAt(i + 1);
            else b += s.charAt(i + 1);
            i++;
        }
        System.out.println(a > b ? "A" : "B");
    }
}
