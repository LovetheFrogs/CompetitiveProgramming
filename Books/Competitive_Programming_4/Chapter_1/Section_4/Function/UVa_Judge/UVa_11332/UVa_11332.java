package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.UVa_Judge.UVa_11332;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11332 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        String s;
        while ((s = br.readLine()) != null) {
            n = Integer.parseInt(s);
            if (n == 0) break;
            System.out.println(solve(n));
        }
    }

    static int solve(int n) {
        int s = n % 10;
        while (n > 0) {
            n /= 10;
            s += n % 10;
        }
        if (s > 9) return solve(s);
        else return s;
    }
}
