package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_missingnumbers;

import java.util.HashSet;
import java.util.Scanner;

public class Missingnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), max = 0;
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int aux = sc.nextInt();
            if (i == n - 1) max = aux;
            s.add(aux);
        }
        boolean a = true;
        for (int i = 1; i <= max; i++) {
            if (!s.contains(i)) {
                a = false;
                System.out.println(i);
            }
        }
        if (a) System.out.println("good job");
    }
}
