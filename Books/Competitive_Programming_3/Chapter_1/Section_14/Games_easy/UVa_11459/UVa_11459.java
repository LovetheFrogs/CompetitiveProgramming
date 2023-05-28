package Books.Competitive_Programming_3.Chapter_1.Section_14.Games_easy.UVa_11459;

import java.io.*;

public class UVa_11459 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int curr = 0, dice;
        int[] p;
        int[] s;
        int t = Integer.parseInt(in.readLine());
        for (int q = 0; q < t; q++) {
            s = new int[100];
            curr = 0;
            for (int i = 0; i < 100; i++) s[i] = i;
            String[] ln = in.readLine().split("[ ]+");
            int a = Integer.parseInt(ln[0]);
            int b = Integer.parseInt(ln[1]);
            int c = Integer.parseInt(ln[2]);
            p = new int[a];
            for (int i = 0; i < a; i++) p[i] = 0;
            for (int i = 0; i < b; i++) {
                ln = in.readLine().split("[ ]+");
                s[(Integer.parseInt(ln[0]) - 1)] =  Integer.parseInt(ln[1]) - 1;
            }
            boolean end = false;
            for (int i = 0; i < c; i++) {
                dice = Integer.parseInt(in.readLine());
                if (!end) {
                    p[curr] = s[p[curr] + dice];
                    if (p[curr] >= 99) {
                        p[curr] = 99;
                        end = true;
                    }
                    curr++;
                    if (curr >= a) curr = 0;
                }
            }
            for (int i = 0; i < a; i++) System.out.println(new StringBuilder().append("Position of player ").append(i + 1).append(" is ").append(p[i] + 1).append("."));
        }
        in.close();
    }
}
