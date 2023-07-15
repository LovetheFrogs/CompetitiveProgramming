package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_12279;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int c = 1;
        while ((s = br.readLine()) != null && !s.equals("0")) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = 0;
            while (st.hasMoreTokens()){
                int aux = Integer.parseInt(st.nextToken());
                if (aux > 0) b++;
                else b--;
            }
            System.out.println("Case " + (c++) + ": " + b);
        }
    }
}
