package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_bossbattle;

import java.util.Scanner;

public class Bossbattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n <= 3 ? 1 : (n - 2));
    }
}
