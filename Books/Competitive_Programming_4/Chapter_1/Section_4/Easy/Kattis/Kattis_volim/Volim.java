package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_volim;

import java.util.Scanner;

public class Volim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int t = 0;
        for (int i = 0; i < q; i++) {
            t += sc.nextInt();
            if (t > 210) break;
            String o = sc.next();
            if (o.equals("T")) p = p < 8 ? p + 1 : 1;
        }
        System.out.println(p);
    }
}
