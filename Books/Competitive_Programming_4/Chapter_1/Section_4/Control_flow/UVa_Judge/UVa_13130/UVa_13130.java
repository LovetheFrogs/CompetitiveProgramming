package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_13130;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_13130 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean d = true;
            for (int j = Integer.parseInt(st.nextToken()); j < 5; j++) if (Integer.parseInt(st.nextToken()) != j + 1) d = false;
            if (d) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
