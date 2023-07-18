package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.Kattis.Kattis_artichoke;

import java.io.*;
import java.util.StringTokenizer;

public class Artichoke {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p, a, b, c, d, n;
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        p = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        double sol = 0;
        double ma = Integer.MIN_VALUE;
        double mi = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double aux = p * (Math.sin(a * i + b) + Math.cos(c * i + d) + 2);
            if (aux > ma) {
                sol = Math.max(sol, ma - mi);
                ma = aux;
                mi = ma;
            } else {
                mi = Math.min(mi, aux);
            }
        }
        sol = Math.max(sol, ma - mi);
        System.out.println(sol);
    }
}
