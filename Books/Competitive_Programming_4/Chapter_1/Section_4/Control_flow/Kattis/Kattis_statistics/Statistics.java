package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_statistics;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mi, ma, n, aux, i = 1;
        while (sc.hasNext()) {
            mi = Integer.MAX_VALUE;
            ma = Integer.MIN_VALUE;
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                aux = sc.nextInt();
                if (aux > ma) ma = aux;
                if (aux < mi) mi = aux;
            }
            System.out.println("Case " + i++ + ": " + mi + " " + ma + " " + (ma - mi));
        }
    }
}
