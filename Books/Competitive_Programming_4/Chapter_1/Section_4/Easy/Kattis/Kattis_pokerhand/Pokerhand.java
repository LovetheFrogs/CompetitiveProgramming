package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_pokerhand;

import java.util.Scanner;

public class Pokerhand {
    public static void main(String[] args) {
        int[] p = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            char aux = s.charAt(0);
            if (aux == 'A') p[0]++;
            else if (aux == 'T') p[9]++;
            else if (aux == 'J') p[10]++;
            else if (aux == 'Q') p[11]++;
            else if (aux == 'K') p[12]++;
            else p[Integer.parseInt(String.valueOf(aux))]++;
        }
        int m = 0;
        for (int i : p) m = i > m ? i : m;
        System.out.println(m);
    }
}
