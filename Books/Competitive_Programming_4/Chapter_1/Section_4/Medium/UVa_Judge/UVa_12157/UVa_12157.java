package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_12157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ms = 0;
            int js = 0;
            for (int j = 0; j < n; j++) {
                int sol = Integer.parseInt(st.nextToken());
                ms += ((sol / 30) + 1) * 10;
                js += ((sol / 60) + 1) * 15;
            }
            System.out.println("Case " + (i + 1) + ": " + ((ms < js) ? ("Mile " + ms) : ((js == ms) ? ("Mile Juice " + js) : ("Juice " + js))));
        }
    }
}
