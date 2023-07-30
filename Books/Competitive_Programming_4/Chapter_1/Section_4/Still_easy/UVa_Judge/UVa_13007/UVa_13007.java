package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_13007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_13007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] aux = { 10000, 1000, 100, 10, 1 };
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
            int a = 0;
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int b = Integer.parseInt(st.nextToken());
                int p = Integer.parseInt(st.nextToken());
                for (int j = 0; j < n - 1; j++) b -= Integer.parseInt(st.nextToken());
                if (p > b) p = 0;
                int sol = 0;
                for (int j = 0; j < 5; j++) {
                    if (aux[j] <= b) {
                        sol = aux[j];
                        break;
                    }
                }
                a += sol - p;
            }
            System.out.println(a);
        }
    }
}
