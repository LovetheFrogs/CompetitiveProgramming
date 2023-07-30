package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_11683;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_11683 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            if (h == 0) break;
            int w = Integer.parseInt(st.nextToken());
            int[] c = new int[w];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < w; i++) c[i] = Integer.parseInt(st.nextToken());
            int sol = 0, prev = h;
            for (int i = 0; i < w; i++) {
                int aux = c[i];
                if (aux < prev) sol += prev - aux;
                prev = aux;
            }
            System.out.println(sol);
        }
    }
}
