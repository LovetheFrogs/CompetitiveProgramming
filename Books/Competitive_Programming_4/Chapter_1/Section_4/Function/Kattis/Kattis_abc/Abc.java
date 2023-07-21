package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_abc;

import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), aux;
        String order = sc.next();
        StringBuilder sol = new StringBuilder();
        if (b < a) {
            aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            aux = c;
            c = b;
            b = aux;
        }
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        for (char s : order.toCharArray()) {
            if (s == 'A') sol.append(a).append(" ");
            else if (s == 'B') sol.append(b).append(" ");
            else sol.append(c).append(" ");
        }
        System.out.println(sol);
    }
}
