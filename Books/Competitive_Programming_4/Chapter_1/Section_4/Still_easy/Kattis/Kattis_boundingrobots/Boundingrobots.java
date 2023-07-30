package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_boundingrobots;

import java.util.Scanner;

public class Boundingrobots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = -1, l = -1;
        while (true) {
            w = sc.nextInt();
            l = sc.nextInt();
            if (w == 0 && l == 0) break;
            int n = sc.nextInt();
            int ax = 0, ay = 0, rx = 0, ry = 0;
            for (int i = 0; i < n; i++) {
                String dir = sc.next();
                int s = sc.nextInt();
                if (dir.equals("u")) {
                    ry += s;
                    if (ay + s < l) ay += s;
                    else ay = l - 1;
                } else if (dir.equals("d")) {
                    ry -= s;
                    if (ay - s >= 0) ay -= s;
                    else ay = 0;
                } else if (dir.equals("r")) {
                    rx += s;
                    if (ax + s < w) ax += s;
                    else ax = w - 1;
                } else {
                    rx -= s;
                    if (ax - s >= 0) ax -= s;
                    else ax = 0;
                }
            }
            System.out.println("Robot thinks " + rx + " " + ry);
            System.out.println("Actually at " + ax + " " + ay + "\n");
        }
    }
}
