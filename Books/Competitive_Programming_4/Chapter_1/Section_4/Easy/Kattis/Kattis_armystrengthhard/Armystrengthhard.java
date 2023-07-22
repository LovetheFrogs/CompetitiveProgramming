package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_armystrengthhard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Armystrengthhard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ng = Integer.parseInt(st.nextToken());
            int nm = Integer.parseInt(st.nextToken());
            List<Integer> ag = new ArrayList<>();
            List<Integer> am = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < ng; j++) ag.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < nm; j++) am.add(Integer.parseInt(st.nextToken()));
            Collections.sort(ag);
            Collections.sort(am);
            int g = 0, m = 0;
            while (g < ag.size() && m < am.size()) {
                if (ag.get(g) < am.get(m)) g++;
                else m++;
            }
            if (g == ag.size() && m == am.size()) System.out.println("uncertain");
            else if (g == ag.size()) System.out.println("MechaGodzilla");
            else System.out.println("Godzilla");
        }
    }
}
