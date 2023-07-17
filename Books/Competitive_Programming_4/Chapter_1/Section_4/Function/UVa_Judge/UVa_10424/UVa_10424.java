package Books.Competitive_Programming_4.Chapter_1.Section_4.Function.UVa_Judge.UVa_10424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class UVa_10424 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String p = br.readLine();
            System.out.println(new DecimalFormat("#.00").format(calculate(s.toLowerCase(), p.toLowerCase())) + " %");
        }
    }

    static double calculate(String a, String b) {
        double sa = 0, sb = 0, aux;
        for (char c : a.toCharArray()) {
            aux = c - 'a' + 1;
            if (aux >= 1 && aux <= 26) sa += aux;
        }
        for (char c : b.toCharArray()) {
            aux = c - 'a' + 1;
            if (aux >= 1 && aux <= 26) sb += aux;
        }
        sa = score((int)sa);
        sb = score((int)sb);
        double t;
        if (sa > sb) t = (sb / sa);
        else t = (sa / sb);
        return t * 100;
    }

    static int score(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        if (s > 9) return score(s);
        else return s;
    }
}
