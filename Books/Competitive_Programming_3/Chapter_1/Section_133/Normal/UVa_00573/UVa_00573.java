package Books.Competitive_Programming_3.Chapter_1.Section_133.Normal.UVa_00573;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_00573 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int h = Integer.parseInt(st.nextToken());
            if (h == 0) break;
            double u = Integer.parseInt(st.nextToken());
            double d = Integer.parseInt(st.nextToken());
            double f = Integer.parseInt(st.nextToken());
            double curr = 0;
            int day = 0;
            double ff = u * f/100;
            while (true) {
                day++;
                if (u > 0) curr += u;
                u = u - ff;
                if (curr > h) break;
                curr = curr - d;
                if (curr < 0) break;
            }
            if (curr < 0) System.out.println(new StringBuilder().append("failure on day ").append(day).toString());
            else System.out.println(new StringBuilder().append("success on day ").append(day).toString());
        }
    }
}
