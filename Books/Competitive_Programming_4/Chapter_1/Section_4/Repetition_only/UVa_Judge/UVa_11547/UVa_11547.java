package Books.Competitive_Programming_4.Chapter_1.Section_4.Repetition_only.UVa_Judge.UVa_11547;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sol = ((n * 567 / 9 + 7492) * 235 / 47 - 498) % 100;
            sol = Math.abs(sol / 10);
            System.out.println(sol);
        }
    }
}
