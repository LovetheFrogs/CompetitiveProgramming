package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int t = Integer.parseInt(s);
        for (int i = 0; i < t; i++) {
            int l, w, h;
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            l = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (l > 20 || w > 20 || h > 20) System.out.println("Case " + (i + 1) + ": bad");
            else System.out.println("Case " + (i + 1) + ": good");
        }
    }
}
