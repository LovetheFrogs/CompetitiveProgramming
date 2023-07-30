package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_peasoup;

import java.util.Scanner;

public class Peasoup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean soup, pan, done = false;
        String sol = null;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            sc.nextLine();
            String resname = sc.nextLine();
            soup = false;
            pan = false;
            for (int j = 0; j < k; j++) {
                String s = sc.nextLine();
                if (s.equals("pea soup") && !done) soup = true;
                else if (s.equals("pancakes") && !done) pan = true;
            }
            if (soup && pan) {
                done = true;
                sol = resname;
            }
        }
        System.out.println(done ? sol : "Anywhere is fine I guess");
    }
}
