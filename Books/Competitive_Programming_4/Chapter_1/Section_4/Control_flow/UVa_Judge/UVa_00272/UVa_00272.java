package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.UVa_Judge.UVa_00272;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_00272 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in;
        boolean f = true;
        while ((in = br.readLine()) != null) {
            for (char c : in.toCharArray()) {
                if (c == 34) {
                    if (f) {
                        System.out.print("``");
                        f = false;
                    } else {
                        System.out.print("''");
                        f = true;
                    }
                } else {
                    System.out.print(c);
                }
            }
            System.out.print("\n");
        }
    }
}
