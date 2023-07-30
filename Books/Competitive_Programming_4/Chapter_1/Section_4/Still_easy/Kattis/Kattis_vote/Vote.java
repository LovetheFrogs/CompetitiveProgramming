package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_vote;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int tot = 0;
            int b = 0;
            int idx = 0;
            int n = sc.nextInt();
            boolean s = false;
            for (int j = 0; j < n; j++) {
                int aux = sc.nextInt();
                tot += aux;
                if (aux > b) {
                    b = aux;
                    s = true;
                    idx = j + 1;
                } else if (aux == b) s = false;
            }
            System.out.println(!s ? "no winner" : ((b * 2) > tot) ? "majority winner " + idx : "minority winner " + idx);
        }
    }
}
