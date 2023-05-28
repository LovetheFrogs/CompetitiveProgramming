package Books.Competitive_Programming_3.Chapter_1.Section_133.Easy.UVa_11559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UVa_11559 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int MAX = 100000000;
        while ((s = br.readLine()) != null) {
            int min = MAX;
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
            for (int j = 0; j < h; j++) {
                int p = Integer.parseInt(br.readLine());
                String av = br.readLine();
                StringTokenizer st2 = new StringTokenizer(av);
                ArrayList<Integer> weeks = new ArrayList<>();
                for (int i = 0; i < w; i++) {
                    weeks.add(Integer.parseInt(st2.nextToken()));
                }
                if (n * p <= b && n * p < min) {
                    for (int i = 0; i < weeks.size(); i++) {
                        if (weeks.get(i) < n) {}
                        else min = n * p;
                    }
                }
            }
            System.out.println(new StringBuilder().append(min != MAX ? min : "stay home"));
        }
    }
}