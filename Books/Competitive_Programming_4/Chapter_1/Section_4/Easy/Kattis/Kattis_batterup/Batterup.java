package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_batterup;

import java.util.Scanner;

public class Batterup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tot = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int aux = sc.nextInt();
            if (aux != -1) {
                c++;
                tot += aux;
            }
        }
        System.out.println((double)tot / c);
    }
}
