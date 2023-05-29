package Books.Competitive_Programming_4.Chapter_1.Section_14.Repetition_only.UVa_Judge.UVa_01124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_01124 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.equals("")) break;
            System.out.println(s);
        }
    }
}
