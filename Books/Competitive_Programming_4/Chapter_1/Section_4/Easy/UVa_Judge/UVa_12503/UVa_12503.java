package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12503;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVa_12503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] ins = new String[n];
            for (int j = 0; j < n; j++) ins[j] = br.readLine();
            int pos = 0;
            for (int j = 0; j < n; j++) pos += move(ins[j], pos, ins);
            System.out.println(pos);
        }
    }

    static int move(String ins, int p, String[] i) {
        if (ins.equals("LEFT")) return -1;
        else if (ins.equals("RIGHT")) return 1;
        else {
            StringTokenizer st = new StringTokenizer(ins);
            st.nextToken();
            st.nextToken();
            int pi = Integer.parseInt(st.nextToken());
            return move(i[pi - 1], p, i);
        }
    }
}
