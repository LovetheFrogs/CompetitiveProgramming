package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12554;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        String song = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
        boolean d = false;
        for (int i = 0; i < n; i++) names[i] = br.readLine();
        int i = 0;
        while (!d) {
            StringTokenizer st = new StringTokenizer(song);
            while (st.hasMoreTokens()) {
                System.out.println(names[i] + ": " + st.nextToken());
                i++;
                if (i == n) {
                    d = true;
                    i = 0;
                }
            }
        }
    }
}
