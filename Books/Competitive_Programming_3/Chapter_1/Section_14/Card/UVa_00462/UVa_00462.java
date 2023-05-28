package Competitive_Programming_3.Chapter_1.Section_14.Card.UVa_00462;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UVa_00462 {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> ms = new HashMap<>();
        ms.put('S', 0);
        ms.put('H', 1);
        ms.put('D', 2);
        ms.put('C', 3);

        char[] b = {'S', 'H', 'D', 'C'};

        Boolean[] ace = {false, false, false, false};
        Boolean[] jack = {false, false, false, false};
        Boolean[] queen = {false, false, false, false};
        Boolean[] king = {false, false, false, false};
        Boolean[] stopped = {false, false, false, false};

        int[] count = {0, 0, 0, 0};
        int p, tp;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("")) break;
            StringTokenizer st = new StringTokenizer(s);
            String card;
            p = 0;
            tp = 0;
            for (int j = 0; j < 4; j++) {
                ace[j] = false;
                jack[j] = false;
                queen[j] = false;
                king[j] = false;
                stopped[j] = false;
                count[j] = 0;
            }
            for (int i = 0; i < 13; i++) {
                card = st.nextToken();
                char c = card.charAt(0);
                int suit = ms.get(card.charAt(1));
                count[suit] += 1;
                if (c == 'A') {
                    p += 4;
                    ace[suit] = true;
                }
                else if (c == 'K') {
                    p += 3;
                    king[suit]  = true;
                }
                else if (c == 'Q') {
                    p += 2;
                    queen[suit]  = true;
                }
                else if (c == 'J') {
                    p += 1;
                    jack[suit]  = true;
                }
            }
            tp = p;
            for (int i = 0; i < 4; i++) {
                if (king[i] && count[i] == 1) {
                    p--;
                    tp--;
                }
                if (queen[i] && count[i] <= 2) {
                    p--;
                    tp--;
                }
                if (jack[i] && count[i] <= 3) {
                    p--;
                    tp--;
                }
                if (ace[i] || (king[i] && count[i] > 1) || (queen[i] && count[i] > 2)) stopped[i] = true;
                if (count[i] == 2) p += 1;
                if (count[i] == 1) p += 2;
                if (count[i] == 0) p += 2;
            }
            if (stopped[0] && stopped[1] && stopped[2] && stopped[3] && tp >= 16) System.out.println("BID NO-TRUMP");
            else if (p >= 14) {
                char out = 'S';
                int max = 0;
                for (int i = 0; i < 4; i++) {
                    if (count[i] > count[max]) {
                        max = i;
                        out = b[i];
                    }
                }
                System.out.println("BID " + out);
            }
            else System.out.println("PASS");
        }
    }
}