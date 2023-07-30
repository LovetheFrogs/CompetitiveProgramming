package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_10324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class UVa_10324 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int ca = 1;
        while (br.ready()) {
            s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            pw.append("Case " + ca++ + ":\n");
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                pw.append(sol(Math.min(a, b), Math.max(a, b), s) ? "Yes\n" : "No\n");
            }
        }
        pw.flush();
    }

    static boolean sol(int a, int b, String s) {
        char aux = s.charAt(a);
        for (int i = a + 1; i <= b; i++) {
            if (s.charAt(i) != aux) return false;
        }
        return true;
    }
}
