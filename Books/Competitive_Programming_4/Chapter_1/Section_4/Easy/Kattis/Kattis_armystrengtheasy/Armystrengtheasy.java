package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_armystrengtheasy;

import java.util.Scanner;
import java.util.Arrays;

public class Armystrengtheasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ng = sc.nextInt();
            int nm = sc.nextInt();
            int[] ag = new int[ng];
            int[] am = new int[nm];
            for (int j = 0; j < ng; j++) ag[j] = sc.nextInt();
            for (int j = 0; j < nm; j++) am[j] = sc.nextInt();
            Arrays.sort(ag);
            Arrays.sort(am);
            int g = 0, m = 0;
            while (g < ng && m < nm) {
                if (ag[g] < am[m]) g++;
                else m++;
            }
            System.out.println(ng - g != 0 ? "Godzilla" : "MechaGodzilla");
        }
    }
}
