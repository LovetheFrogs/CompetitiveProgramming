package Competitive_Programming_3.Chapter_1.Section_133.Easy.UVa_10114;

import java.util.HashMap;
import java.util.Scanner;

public class UVa_10114 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        while (l >= 0) {
            double d = sc.nextDouble(), p = sc.nextDouble();
            HashMap<Integer, Double> disc = new HashMap<>();
            int less = sc.nextInt();
            for (int i = 0; i < less; i++) {
                disc.put(sc.nextInt(), sc.nextDouble());
            }
            computeMonths(p, d, disc, l);
            l = sc.nextInt();
        }
    }

    public static void computeMonths(double price, double down, HashMap<Integer, Double> disc, int months) {
        double rem = price;
        double pay = price / months;
        double carPrice = (price + down) * (1 - disc.getOrDefault(0, 0.0));
        double currDis = disc.getOrDefault(0, 0.0);
        int j = 0;
        while (rem > carPrice) {
            j++;
            rem -= pay;
            currDis = disc.getOrDefault(j, currDis);
            carPrice *= 1 - currDis;
        }
        System.out.println(new StringBuilder().append(j).append(j == 1 ? " month" : " months").toString());
    }
}
