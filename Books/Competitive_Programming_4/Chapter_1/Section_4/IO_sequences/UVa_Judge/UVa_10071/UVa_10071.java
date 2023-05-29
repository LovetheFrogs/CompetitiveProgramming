package Books.Competitive_Programming_4.Chapter_1.Section_14.IO_sequences.UVa_Judge.UVa_10071;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_10071 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("")) break;
            StringTokenizer st = new StringTokenizer(s);
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            System.out.println(v * t * 2);
        }
    }
}