package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_hangingout;

import java.util.Scanner;

public class Hangingout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), x = sc.nextInt();
        int curr = 0, den = 0;
        for (int i = 0; i < x; i++) {
            String e = sc.next();
            int aux = sc.nextInt();
            if (e.equals("enter")) {
                if (curr + aux <= l) curr += aux;
                else den++;
            } else curr -= aux;
        }
        System.out.println(den);
    }
}
