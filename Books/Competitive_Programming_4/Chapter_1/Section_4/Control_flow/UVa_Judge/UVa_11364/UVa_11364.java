package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_11364;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVa_11364 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] num = new int[n];
            int s = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) num[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(num);
            for (int j = 1; j < n; j++) s += Math.abs(num[j] - num[j - 1]);
            System.out.println(s * 2);
        }
    }
}
