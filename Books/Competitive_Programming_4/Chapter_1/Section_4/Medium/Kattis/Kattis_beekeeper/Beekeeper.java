package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_beekeeper;

import java.util.Scanner;

public class Beekeeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int sol = 0;
            String w = "";
            String s;
            for (int i = 0; i < n; i++) {
                s = sc.next();
                int aux = 0;
                for (int j = 0; j < s.length() - 1; j++) {
                    if (isVowel(s.charAt(j)) && s.charAt(j) == s.charAt(j + 1)) aux++;
                }
                if (aux >= sol) {
                    sol = aux;
                    w = s;
                }
            }
            System.out.println(w);
        }
    }

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y');
    }
}
