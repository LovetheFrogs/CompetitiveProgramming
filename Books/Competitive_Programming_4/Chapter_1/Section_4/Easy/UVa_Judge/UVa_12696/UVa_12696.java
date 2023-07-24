package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12696;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int ac = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double len = Double.parseDouble(st.nextToken());
            double wid = Double.parseDouble(st.nextToken());
            double dep = Double.parseDouble(st.nextToken());
            double wei = Double.parseDouble(st.nextToken());
            if (wei > 7.00) System.out.println(0);
            else if (len + wid + dep <= 125.00) {
                System.out.println(1);
                ac++;
            } else if (len <= 56.00 && wid <= 45.00 && dep <= 25.00) {
                System.out.println(1);
                ac++;
            }
            else System.out.println(0);
        }
        System.out.println(ac);
    }
}
