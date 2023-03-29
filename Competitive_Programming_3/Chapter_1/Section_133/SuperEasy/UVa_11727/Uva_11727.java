package Competitive_Programming_3.Chapter_1.Section_133.SuperEasy.UVa_11727;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Uva_11727 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            StringBuilder s = new StringBuilder();
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            ArrayList<Integer> l = new ArrayList<>();
            l.add(a);
            l.add(b);
            l.add(c);
            Collections.sort(l);
            System.out.println(s.append("Case ").append(i + 1).append(": ").append(l.get(1)).toString());
        }
    }
}
