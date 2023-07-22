package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.UVa_Judge.UVa_01585;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_01585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i < t; i++) {
            s = br.readLine();
            int cons = 0;
            int tot = 0;
            for (char c : s.toCharArray()) {
                if (c == 'O') {
                    cons += 1;
                    tot += cons;
                } else cons = 0;
            }
            System.out.println(tot);
        }
    }
}
