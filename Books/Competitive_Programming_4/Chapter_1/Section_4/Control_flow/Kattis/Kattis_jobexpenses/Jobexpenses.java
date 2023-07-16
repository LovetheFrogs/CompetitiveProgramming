package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_jobexpenses;

import java.util.Scanner;

public class Jobexpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), aux, s = 0;
        for (int i = 0; i < n; i++) {
            aux = sc.nextInt();
            if (aux < 0) s += (aux * (-1));
        }
        System.out.println(s);
    }
}
