package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_brokenswords;

import java.util.Scanner;

public class Brokenswords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tb = 0, lr = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.charAt(0) == '0') tb++;
            if (s.charAt(1) == '0') tb++;
            if (s.charAt(2) == '0') lr++;
            if (s.charAt(3) == '0') lr++;
        }
        int tot = 0;
        while (tb >= 2 && lr >= 2) {
            tb -= 2;
            lr -= 2;
            tot++;
        }
        System.out.println(tot + " " + tb + " " + lr);
    }
}
