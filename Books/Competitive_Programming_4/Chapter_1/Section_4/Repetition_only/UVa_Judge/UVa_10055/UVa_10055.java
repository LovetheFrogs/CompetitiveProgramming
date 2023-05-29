package Books.Competitive_Programming_4.Chapter_1.Section_4.Repetition_only.UVa_Judge.UVa_10055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_10055 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("")) break;
            StringTokenizer st = new StringTokenizer(s);
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            System.out.println(Math.abs(b - a));
        }
    }
}
