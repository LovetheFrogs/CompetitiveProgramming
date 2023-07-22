package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.UVa_Judge.UVa_11942;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_11942 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println("Lumberjacks:");
        for (int i = 0; i < n; i++) {
            boolean a = true, t = true;
            int prev = -1;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int s = Integer.parseInt(st.nextToken());
                if (j == 0) {
                    prev = s;
                } else if (j == 1) {
                    if (s < prev) a = false;
                    prev = s;
                } else {
                    if (a && s <= prev) t = false;
                    else if (!a && s >= prev) t = false;
                    prev = s;
                }
            }
            System.out.println(t ? "Ordered" : "Unordered");
        }
    }
}
