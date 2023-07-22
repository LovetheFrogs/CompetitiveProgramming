package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.Kattis.Kattis_drinkingsong;

import java.util.Scanner;

public class Drinkingsong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String b = sc.next();
        while (i > 0) {
            if (i > 1) System.out.println(
                    i + " bottles of " + b + " on the wall, " +
                    i + " bottles of " + b + ".\n" + "Take one down, pass it around, " +
                    (i - 1) + (i - 1 > 1 ? " bottles of " : " bottle of ") + b + " on the wall.\n"
            );
            else System.out.println(
                    "1 bottle of " + b + " on the wall, 1 bottle of " + b + ".\n" +
                    "Take it down, pass it around, no more bottles of " + b + ".\n"
            );
            i--;
        }
    }
}
