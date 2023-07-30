package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_11661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11661 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l;
        while ((l = Integer.parseInt(br.readLine())) != 0) {
            int sol = Integer.MAX_VALUE, auxR = -1, auxD = -1;
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'Z') {
                    sol = 0;
                    break;
                } else if (c == 'R') {
                    if (auxD != -1) sol = Math.min(sol, i - auxD);
                    auxR = i;
                } else if (c == 'D') {
                    if (auxR != -1) sol = Math.min(sol, i - auxR);
                    auxD = i;
                }
            }
            System.out.println(sol);
        }
    }
}
