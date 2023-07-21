package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_filip;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int a, b;
        a = Integer.parseInt(flip(l[0]));
        b = Integer.parseInt(flip(l[1]));
        System.out.println(a > b ? a : b);
    }

    static String flip(String s) {
        StringBuilder ns = new StringBuilder();
        ns.append(s.charAt(2));
        ns.append(s.charAt(1));
        ns.append(s.charAt(0));

        return ns.toString();
    }
}
