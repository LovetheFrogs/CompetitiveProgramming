package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_acm;

import java.util.HashMap;
import java.util.Scanner;

public class Acm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int tp = 0;
        HashMap<String, Integer> ps = new HashMap<>();
        while (true) {
            int t = sc.nextInt();
            if (t == -1) break;
            String p = sc.next();
            String v = sc.next();
            if (v.equals("right")) {
                if (ps.containsKey(p)) tp += ps.get(p) + t;
                else tp += t;
                n++;
            } else {
                if (ps.containsKey(p)) ps.put(p, ps.get(p) + 20);
                else ps.put(p, 20);
            }
        }
        System.out.println(n + " " + tp);
    }
}
