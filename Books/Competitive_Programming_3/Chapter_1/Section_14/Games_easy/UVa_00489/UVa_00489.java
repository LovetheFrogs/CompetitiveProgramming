package Competitive_Programming_3.Chapter_1.Section_14.Games_easy.UVa_00489;

import java.util.HashSet;
import java.util.Scanner;

public class UVa_00489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        while (r != -1) {
            String word = sc.next();
            String guess = sc.next();
            int g = 7;
            int wl = word.length();
            int gl = 0;
            HashSet<Character> chars = new HashSet<>();
            for (int i = 0; i < guess.length(); i++) {
                boolean f = false;
                char a = guess.charAt(i);
                if (!chars.contains(a)) {
                    chars.add(a);
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(j) == a) {
                            gl++;
                            f = true;
                        }
                    }
                    if (!f) g--;
                }
                if (gl == wl || g <= 0) break;
            }

            String res = "";
            if (gl == wl) res = "You win.";
            else if (g <= 0) res = "You lose.";
            else if (g > 0) res = "You chickened out.";
            System.out.println(new StringBuilder().append("Round ").append(r).append("\n").append(res));
            r = sc.nextInt();
        }
    }
}
