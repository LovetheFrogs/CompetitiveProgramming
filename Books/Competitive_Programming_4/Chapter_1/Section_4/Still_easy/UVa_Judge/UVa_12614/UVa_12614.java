package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_12614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int sol = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int aux = Integer.parseInt(st.nextToken());
                if (sol < aux) sol = aux;
            }
            System.out.println(new StringBuilder().append("Case ").append(i + 1).append(": ").append(sol));
        }
    }
}
