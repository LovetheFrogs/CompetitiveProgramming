package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12646;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12646 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int a, b, c;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if (a == b && b == c) System.out.println("*");
            else if (a == b) System.out.println("C");
            else if (a == c) System.out.println("B");
            else System.out.println("A");
        }
    }
}
