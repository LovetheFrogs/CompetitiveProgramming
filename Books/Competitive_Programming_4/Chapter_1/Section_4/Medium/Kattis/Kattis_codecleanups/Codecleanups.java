package Books.Competitive_Programming_4.Chapter_1.Section_4.Medium.Kattis.Kattis_codecleanups;

import java.util.*;

public class Codecleanups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sol = 0, d = 0;
        ArrayList<Integer> q = new ArrayList<>();
        ArrayList<Integer> tq = new ArrayList<>();
        for (int i = 0; i < n; i++) q.add(sc.nextInt());
        for (int i = 0; i < n; i++) {
            int aux = 0;
            for (int j = 0; j < tq.size(); j++) aux += q.get(i) - d - tq.get(j);
            if (aux < 20) tq.add(q.get(i) - d);
            else {
                d = q.get(i);
                sol++;
                tq.clear();
                tq.add(q.get(i) - d);
            }
        }
        System.out.println(sol + 1);
    }
}
