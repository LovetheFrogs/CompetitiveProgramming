package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_00661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class UVa_00661 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int f = 1;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0 && c == 0) break;
            HashMap<Integer, Integer> p = new HashMap<>();
            int curr = 0, ma = 0;
            boolean pop = false;
            for (int i = 1; i <= n; i++) p.put(i, 0 - Integer.parseInt(br.readLine()));
            for (int i = 0; i < m; i++) {
                int aux = Integer.parseInt(br.readLine());
                p.put(aux, -(p.get(aux)));
                curr += p.get(aux);
                ma = Math.max(ma, curr);
                if (curr > c) pop = true;
            }
            System.out.println("Sequence " + f);
            System.out.println(pop ? ("Fuse was blown." + "\n") : ("Fuse was not blown.\nMaximal power consumption was " + ma + " amperes.\n"));
            f++;
        }
    }
}
