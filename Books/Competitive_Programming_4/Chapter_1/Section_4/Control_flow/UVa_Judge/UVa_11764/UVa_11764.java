package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_11764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_11764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int h, l;
        for (int i = 0; i < t; i++) {
            h = 0;
            l = 0;
            int n = Integer.parseInt(br.readLine());
            int aux;
            StringTokenizer st = new StringTokenizer(br.readLine());
            aux = Integer.parseInt(st.nextToken());
            for (int j = 1; j < n; j++) {
                int c = Integer.parseInt(st.nextToken());
                if (c > aux) h++;
                else if (c < aux) l++;
                aux = c;
            }
            System.out.println("Case " + (i + 1) + ": " + h + " " + l);
        }
    }
}
