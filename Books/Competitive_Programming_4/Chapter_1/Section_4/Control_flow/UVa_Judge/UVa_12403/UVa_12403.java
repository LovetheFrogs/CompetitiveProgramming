package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_12403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        long s = 0;
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("donate")) s += Integer.parseInt(st.nextToken());
            else System.out.println(s);
        }
    }
}
