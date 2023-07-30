package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_11586;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int m = 0, f = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'M') m++;
                else if (s.charAt(j) == 'F') f++;
            }
            System.out.println((m == f && m > 1)? "LOOP" : "NO LOOP");
        }
    }
}
