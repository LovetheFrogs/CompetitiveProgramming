package Competitive_Programming_3.Chapter_1.Section_14.Chess.UVa_00696;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_00696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("0 0")) break;
            StringTokenizer st = new StringTokenizer(s);
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0 || m == 0) System.out.println(new StringBuilder().append(0).append(" knights may be placed on a ").append(m).append(" row ").append(n).append(" column board."));
            else if (n == 1 || m == 1) System.out.println(new StringBuilder().append(n * m).append(" knights may be placed on a ").append(m).append(" row ").append(n).append(" column board."));
            else if (n == 2 || m == 2) {
                int l;
                int mod;
                if (m > n) l = m;
                else l = n;
                int res;
                mod = l % 4;
                res = 4 * (l / 4);
                if (mod == 1) res += 2;
                else if (mod == 2 || mod == 3) res += 4;
                System.out.println(new StringBuilder().append(res).append(" knights may be placed on a ").append(m).append(" row ").append(n).append(" column board."));
            }
            else System.out.println(new StringBuilder().append(((m + 1) / 2) * ((n + 1) / 2) + (m / 2) * (n / 2)).append(" knights may be placed on a ").append(m).append(" row ").append(n).append(" column board."));
        }
    }
}
