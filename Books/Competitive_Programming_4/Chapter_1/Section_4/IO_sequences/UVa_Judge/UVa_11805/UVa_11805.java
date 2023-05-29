package Books.Competitive_Programming_4.Chapter_1.Section_4.IO_sequences.UVa_Judge.UVa_11805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_11805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);

        for (int i = 0; i < t; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int sol = (p + k) % n;
            if (sol == 0) sol = n;
            System.out.println("Case " + (i + 1) + ": " + sol);
        }
    }
}
