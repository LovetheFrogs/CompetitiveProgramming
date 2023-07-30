package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_prerequisites;

import java.util.HashSet;
import java.util.Scanner;

public class Prerequisites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int k = sc.nextInt();
            if (k == 0) break;
            int m = sc.nextInt();
            HashSet<Integer> s = new HashSet<>();
            for (int i = 0; i < k; i++) s.add(sc.nextInt());
            boolean a = true;
            for (int i = 0; i < m; i++) {
                int c = sc.nextInt(), r = sc.nextInt();
                int cu = 0;
                for (int j = 0; j < c; j++) {
                    int aux = sc.nextInt();
                    if (a && s.contains(aux)) cu++;
                }
                if (cu < r) a = false;
            }
            System.out.println(a ? "yes" : "no");
        }
    }
}
