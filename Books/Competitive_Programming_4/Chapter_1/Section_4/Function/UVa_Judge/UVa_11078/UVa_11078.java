package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.UVa_Judge.UVa_11078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11078 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] sc = new int[n];
            for (int j = 0; j < n; j++) sc[j] = Integer.parseInt(br.readLine());
            int senior = sc[0];
            int s = Integer.MIN_VALUE;
            for (int j = 1; j < sc.length; j++) {
                s = Math.max(s, senior - sc[j]);
                senior = Math.max(senior, sc[j]);
            }
            System.out.println(s);
        }
    }
}
