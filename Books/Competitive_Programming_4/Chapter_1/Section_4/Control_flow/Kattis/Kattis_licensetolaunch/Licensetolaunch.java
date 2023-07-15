package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_licensetolaunch;

import java.util.Scanner;

public class Licensetolaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ix = -1, aux, mi = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            aux = sc.nextInt();
            if (aux < mi) {
                mi = aux;
                ix = i;
            }
        }
        System.out.println(ix);
    }
}
