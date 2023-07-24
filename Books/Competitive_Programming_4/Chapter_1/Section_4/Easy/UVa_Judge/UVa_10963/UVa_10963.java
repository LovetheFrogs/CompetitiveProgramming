package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_10963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_10963 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            br.readLine();
            int n = Integer.parseInt(br.readLine()) - 1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            double dif = Math.abs(Double.parseDouble(st.nextToken()) - Double.parseDouble(st.nextToken()));
            boolean a = true;
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                double curr = Math.abs(Double.parseDouble(st.nextToken()) - Double.parseDouble(st.nextToken()));
                if (curr != dif) a = false;
            }
            System.out.println(a ? "yes" : "no");
            if (t != 0) System.out.println();
        }
    }
}