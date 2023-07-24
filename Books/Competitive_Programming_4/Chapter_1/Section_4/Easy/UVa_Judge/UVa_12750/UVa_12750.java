package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_12750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sol = 0, cons = 0;
            boolean f = false;
            for (int j = 0; j < n; j++) {
                if (cons == 3) f = true;
                if (br.readLine().equals("W")&& !f) {
                    sol++;
                    cons = 0;
                } else if (!f) {
                    sol++;
                    cons++;
                }
            }
            if (cons == 3) f = true;
            System.out.println("Case " + (i + 1) + ": " + (f ? sol : "Yay! Mighty Rafa persists!"));
        }
    }
}
