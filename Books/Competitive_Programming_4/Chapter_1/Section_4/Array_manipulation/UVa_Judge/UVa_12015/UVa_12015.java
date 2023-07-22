package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.UVa_Judge.UVa_12015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        for (int k = 0; k < t; k++) {
            int ms = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                s = st.nextToken();
                int v = Integer.parseInt(st.nextToken());
                if (v > ms) {
                    ms = v;
                    sb = new StringBuilder().append(s + "\n");
                } else if (v == ms) sb.append(s + "\n");
            }
            System.out.println("Case #" + (k + 1) + ":");
            System.out.print(sb);
        }
    }
}
