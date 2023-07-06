package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.UVa_Judge.UVa_12250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_12250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 1;
        while (!s.equals("#")) {
            if (s.equals("HELLO")) System.out.println("Case " + i + ": ENGLISH");
            else if (s.equals("HOLA")) System.out.println("Case " + i + ": SPANISH");
            else if (s.equals("HALLO")) System.out.println("Case " + i + ": GERMAN");
            else if (s.equals("BONJOUR")) System.out.println("Case " + i + ": FRENCH");
            else if (s.equals("CIAO")) System.out.println("Case " + i + ": ITALIAN");
            else if (s.equals("ZDRAVSTVUJTE")) System.out.println("Case " + i + ": RUSSIAN");
            else System.out.println("Case " + i + ": UNKNOWN");
            i++;
            s = br.readLine();
        }
    }
}
