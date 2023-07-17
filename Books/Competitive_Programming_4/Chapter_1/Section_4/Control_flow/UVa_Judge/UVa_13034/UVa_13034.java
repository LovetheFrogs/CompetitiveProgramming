package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_13034;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_13034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean d;
        int s = Integer.parseInt(br.readLine());
        for (int i = 1; i <= s; i++) {
            d = true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) if (Integer.parseInt(st.nextToken()) == 0) d = false;
            if (d) System.out.println("Set #" + i + ": Yes");
            else System.out.println("Set #" + i + ": No");
        }
    }
}
