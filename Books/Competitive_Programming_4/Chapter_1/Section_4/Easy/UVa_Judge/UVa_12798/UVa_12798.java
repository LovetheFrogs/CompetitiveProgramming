package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            boolean[] t = new boolean[n];
            for (int i = 0; i < n; i++) t[i] = true;
            for (int i = 0; i < n; i++) {
                String[] aux = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    if (t[i]) t[i] = Integer.parseInt(aux[j]) > 0 ? true : false;
                }
            }
            int sol = 0;
            for (boolean a : t) sol = a ? sol + 1 : sol + 0;
            System.out.println(sol);
        }
    }
}
