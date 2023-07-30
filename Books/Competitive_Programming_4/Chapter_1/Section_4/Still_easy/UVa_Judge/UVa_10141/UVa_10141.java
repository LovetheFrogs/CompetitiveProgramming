package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_10141;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_10141 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int c = 1;
        StringBuilder res = new StringBuilder();
        while ((s = br.readLine()) != null) {
            int maxPropos = 0;
            double minPrice = Integer.MAX_VALUE;
            String winner = "";
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            if (n == 0 && p == 0) break;
            for (int i = 0; i < n; i++) {
                s = br.readLine();
            }
            for (int j = 0; j < p; j++) {
                String proposal = br.readLine();
                s = br.readLine();
                StringTokenizer st2 = new StringTokenizer(s);
                double price = Double.parseDouble(st2.nextToken());
                int met = Integer.parseInt(st2.nextToken());
                for (int i = 0; i < met; i++) {
                    s = br.readLine();
                }
                if (met >= maxPropos) {
                    if (met == maxPropos && price < minPrice) {
                        minPrice = price;
                        maxPropos = met;
                        winner = proposal;
                    } else if (met > maxPropos) {
                        minPrice = price;
                        maxPropos = met;
                        winner = proposal;
                    }
                }
            }
            res.append("RFP #").append(c).append("\n").append(winner).append("\n\n");
            c++;
        }
        res.deleteCharAt(res.length() - 1).deleteCharAt(res.length() - 1);
        System.out.println(res);
    }
}
