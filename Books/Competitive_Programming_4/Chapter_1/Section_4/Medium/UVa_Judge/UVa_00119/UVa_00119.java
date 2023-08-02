package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_00119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class UVa_00119 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        boolean f = true;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            String[] na = br.readLine().split(" ");
            HashMap<String, Integer> nw = new HashMap<>();
            for (String aux : na) nw.put(aux, 0);
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                String aux = st.nextToken();
                int m = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                if (p == 0) continue;
                int pp = m / p;
                nw.put(aux, nw.get(aux) - (pp * p));
                for (int j = 0; j < p; j++) {
                    String per = st.nextToken();
                    nw.put(per, nw.get(per) + pp);
                }
            }
            if (!f) System.out.println();
            else f = false;
            for (int i = 0; i < n; i++) System.out.println(na[i] + " " + nw.get(na[i]));
        }
    }
}
