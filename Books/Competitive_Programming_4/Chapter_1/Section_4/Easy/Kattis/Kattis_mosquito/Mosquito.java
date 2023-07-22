package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_mosquito;

import java.util.Scanner;

public class Mosquito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt(), p = sc.nextInt(), l = sc.nextInt(), e = sc.nextInt(), r = sc.nextInt(), s = sc.nextInt(), n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int pm = m, pl = l, pp = p;
                l = pm * e;
                p = pl / r;
                m = pp / s;
            }
            System.out.println(m);
        }
    }
}
