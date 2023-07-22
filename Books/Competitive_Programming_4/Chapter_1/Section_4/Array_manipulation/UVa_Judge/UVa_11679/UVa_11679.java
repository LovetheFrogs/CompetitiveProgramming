package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.UVa_Judge.UVa_11679;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_11679 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int[] credit = new int[b];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 1; i <= b; i++) credit[i - 1] = Integer.parseInt(st2.nextToken());
            for (int i = 1; i <= n; i++) {
                StringTokenizer st3 = new StringTokenizer(br.readLine());
                int d = Integer.parseInt(st3.nextToken());
                int c = Integer.parseInt(st3.nextToken());
                int v = Integer.parseInt(st3.nextToken());
                credit[d - 1] -= v;
                credit[c - 1] += v;
            }
            boolean val = true;
            for (int i : credit) {
                if (i < 0) val = false;
            }
            System.out.println(val ? "S" : "N");
        }
    }
}
