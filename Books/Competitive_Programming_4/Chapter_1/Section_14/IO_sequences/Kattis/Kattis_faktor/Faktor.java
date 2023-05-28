package Books.Competitive_Programming_4.Chapter_1.Section_14.IO_sequences.Kattis.Kattis_faktor;

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt() - 1;
        System.out.println(a * i + 1);
    }
}
