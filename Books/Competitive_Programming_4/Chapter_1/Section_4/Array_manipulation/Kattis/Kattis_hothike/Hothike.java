package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_hothike;

import java.util.Scanner;

public class Hothike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int d = -1;
        sc.nextLine();
        String[] t = sc.nextLine().split(" ");
        for (int i = 0; i < n - 2; i++) {
            if (Math.max(Integer.parseInt(t[i]), Integer.parseInt(t[i + 2])) < min) {
                min = Math.max(Integer.parseInt(t[i]), Integer.parseInt(t[i + 2]));
                d = i + 1;
            }
        }
        System.out.println(d + " " + min);
    }
}
