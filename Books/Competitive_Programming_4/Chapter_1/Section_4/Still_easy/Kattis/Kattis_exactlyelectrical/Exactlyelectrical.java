package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.Kattis.Kattis_exactlyelectrical;

import java.util.Scanner;

public class Exactlyelectrical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), t = sc.nextInt();
        int dis = Math.abs(a - c) + Math.abs(b - d);
        System.out.println(t < dis ? "N" : (t % 2 == dis % 2 ? "Y" : "N"));
    }
}
