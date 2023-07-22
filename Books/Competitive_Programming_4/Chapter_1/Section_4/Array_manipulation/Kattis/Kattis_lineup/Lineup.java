package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_lineup;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lineup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] t = new String[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.next();
        }
        String[] dt = t.clone();
        String[] at = t.clone();
        Arrays.sort(at);
        Arrays.sort(dt, Collections.reverseOrder());
        if (Arrays.equals(t, dt)) System.out.println("DECREASING");
        else if (Arrays.equals(t, at)) System.out.println("INCREASING");
        else System.out.println("NEITHER");
    }
}
