package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12917;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int p, h, o;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            p = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            o = Integer.parseInt(st.nextToken());
            if (h > o - p) System.out.println("Hunters win!");
            else System.out.println("Props win!");
        }
    }
}
