package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_01641;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_01641 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int h = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
            int aux = 0;
            double sol = 0;
            String[] shape = new String[h];
            for (int i = 0; i < h; i++) shape[i] = br.readLine();
            for (String l : shape) {
                for (char c : l.toCharArray()) {
                    if ((c == '/' || c == '\\') && aux == 0) {
                        aux = 1;
                        sol += 0.5;
                    } else if ((c == '/' || c == '\\') && aux == 1) {
                        aux = 0;
                        sol += 0.5;
                    } else if (c == '.' && aux == 1) sol++;
                }
                aux = 0;
            }
            System.out.println((int)sol);
        }
    }
}
