package Books.Competitive_Programming_4.Chapter_1.Section_4.IO_sequences.UVa_Judge.UVa_11614;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UVa_11614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            double n = Double.parseDouble(br.readLine());
            System.out.println((long) (-1 + Math.sqrt(1 + (8 * n))) / 2);
        }
    }
}
