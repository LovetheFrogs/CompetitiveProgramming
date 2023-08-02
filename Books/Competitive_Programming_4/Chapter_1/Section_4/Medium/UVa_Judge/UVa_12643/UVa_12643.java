package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_12643;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12643 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken()), i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken()), sol = 0;
            for (int k = 0; k < n; k++) {
                i = (i + 1) / 2;
                j = (j + 1) / 2;
                sol = k;
                if (i == j) break;
            }
            System.out.println(sol + 1);
        }
    }
}
