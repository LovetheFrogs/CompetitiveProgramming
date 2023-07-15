package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_12577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i = 1;
        while (true) {
            s = br.readLine();
            if (s.equals("*")) break;
            else if (s.equals("Hajj")) System.out.println(new StringBuilder().append("Case ").append(i++).append(": Hajj-e-Akbar"));
            else if (s.equals("Umrah")) System.out.println(new StringBuilder().append("Case ").append(i++).append(": Hajj-e-Asghar"));
        }
    }
}
