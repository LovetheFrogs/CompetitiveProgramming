package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_01237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_01237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()), aux = 0;
        for (int z = 0; z < t; z++) {
            if (aux != 0) System.out.println();
            int d = Integer.parseInt(br.readLine());
            String[] p = new String[d];
            int[] mnp = new int[d];
            int[] mxp = new int[d];
            for (int i = 0; i < d; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                p[i] = st.nextToken();
                mnp[i] = Integer.parseInt(st.nextToken());
                mxp[i] = Integer.parseInt(st.nextToken());
            }
            int q = Integer.parseInt(br.readLine());
            for (int i = 0; i < q; i++) {
                String sol = "UNDETERMINED";
                int price = Integer.parseInt(br.readLine());
                for (int j = 0; j < d; j++) {
                    if (mnp[j] <= price && mxp[j] >= price && sol.equals("UNDETERMINED")) sol = p[j];
                    else if  (mnp[j] <= price && mxp[j] >= price) {
                        sol = "UNDETERMINED";
                        break;
                    }
                }
                System.out.println(sol);
            }
            if (aux == 0) aux++;
        }
    }
}
