package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_13012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_13012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum;
        while ((s = br.readLine()) != null) {
            sum = 0;
            int t = Integer.parseInt(s);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 5; i++) if (Integer.parseInt(st.nextToken()) == t) sum += 1;
            System.out.println(sum);
        }
    }
}
