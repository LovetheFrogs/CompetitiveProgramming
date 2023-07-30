package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_deathtaxes;

import java.util.Scanner;

public class Deathtaxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sprice = 1;
        int stocks = 0;
        while (true) {
            String a = sc.next();
            if (a.equals("buy")) {
                int x = sc.nextInt(), y = sc.nextInt();
                double navg = (stocks * sprice) + (x * y);
                navg /= (stocks + x);
                sprice = navg;
                stocks += x;
            } else if (a.equals("sell")) {
                int s = sc.nextInt(), p = sc.nextInt();
                stocks -= s;
            } else if (a.equals("split")) {
                int spl = sc.nextInt();
                stocks *= spl;
                sprice /= spl;
            } else if (a.equals("merge")) {
                int spl = sc.nextInt();
                stocks /= spl;
                sprice *= spl;
            } else if (a.equals("die")) {
                double p = sc.nextDouble();
                System.out.println(stocks * (p - (Math.max(p - sprice, 0.0) * 0.3)));
                break;
            }
        }
    }
}
