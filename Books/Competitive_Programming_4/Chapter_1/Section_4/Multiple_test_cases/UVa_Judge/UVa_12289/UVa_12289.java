package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12289;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_12289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        for (int i = 0; i <  t; i++) {
            s = br.readLine();
            if (s.length() == 5) System.out.println("3");
            else if ((s.contains("o") && s.contains("n")) || (s.contains("o") && s.contains("e")) || (s.contains("n") && s.contains("e"))) System.out.println("1");
            else if ((s.contains("t") && s.contains("w")) || (s.contains("t") && s.contains("o")) || (s.contains("w") && s.contains("o"))) System.out.println("2");
        }
    }
}
