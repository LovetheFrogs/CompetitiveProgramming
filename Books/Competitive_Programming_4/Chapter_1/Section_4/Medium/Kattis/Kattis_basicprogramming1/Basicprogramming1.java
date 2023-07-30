package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_basicprogramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Basicprogramming1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
        switch (t) {
            case 1:
                System.out.println(7);
                break;
            case 2:
                if (a[0] > a[1]) System.out.println("Bigger");
                else if (a[0] == a[1]) System.out.println("Equal");
                else System.out.println("Smaller");
                break;
            case 3:
                long[] aux = { a[0], a[1], a[2] };
                Arrays.sort(aux);
                System.out.println(aux[1]);
                break;
            case 4:
                long sol = 0;
                for (long b : a) sol += b;
                System.out.println(sol);
                break;
            case 5:
                sol = 0;
                for (long b : a) sol += (b % 2 == 0 ? b : 0);
                System.out.println(sol);
                break;
            case 6:
                for (long b : a) System.out.print((char)(b % 26 + 'a'));
                break;
            case 7:
                boolean[] b = new boolean[n];
                for (int j = 0; j < n; j++) b[j] = false;
                long i = 0;
                while (true) {
                    i = a[(int)i];
                    if (i >= n) {
                        System.out.println("Out");
                        break;
                    } else if (i == n - 1) {
                        System.out.println("Done");
                        break;
                    } else if (b[(int)i]) {
                        System.out.println("Cyclic");
                        break;
                    } else b[(int)i] = true;
                }
                break;
        }
    }
}
