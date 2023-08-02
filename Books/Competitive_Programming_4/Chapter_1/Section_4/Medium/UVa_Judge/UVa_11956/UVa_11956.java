package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.UVa_Judge.UVa_11956;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UVa_11956 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String s = br.readLine();
            int[] mem = new int[100];
            Arrays.fill(mem, 0);
            int p = 0;
            for (char c : s.toCharArray()) {
                if (c == '+') {
                    if (mem[p] == 255) mem[p] = 0;
                    else mem[p]++;
                } else if (c == '-') {
                    if (mem[p] == 0) mem[p] = 255;
                    else mem[p]--;
                } else if (c == '>') {
                    if (p == 99) p = 0;
                    else p++;
                } else if (c == '<') {
                    if (p == 0) p = 99;
                    else p--;
                }
            }
            System.out.print("Case " + i + ": ");
            for (int j = 0; j < 100; j++) {
                String d = Integer.toHexString(mem[j]).toUpperCase();
                if (d.length() == 1) d = "0" + d;
                System.out.print(d);
                if (j != 99) System.out.print(" ");
                else System.out.print("\n");
            }
        }
    }
}
