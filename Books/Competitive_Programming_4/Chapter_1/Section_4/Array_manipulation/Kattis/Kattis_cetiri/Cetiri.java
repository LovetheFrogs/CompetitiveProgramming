package Books.Competitive_Programming_4.Chapter_1.Section_4.Array_manipulation.Kattis.Kattis_cetiri;

import java.util.Arrays;
import java.util.Scanner;

public class Cetiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        Arrays.sort(n);
        if (n[1] - n[0] == n[2] - n[1]) System.out.println(n[2] + (n[2] - n[1]));
        else if (n[1] - n[0] > n[2] - n[1]) System.out.println(n[0] + (n[2] - n[1]));
        else if (n[1] - n[0] < n[2] - n[1]) System.out.println(n[1] + (n[1] - n[0]));
    }
}