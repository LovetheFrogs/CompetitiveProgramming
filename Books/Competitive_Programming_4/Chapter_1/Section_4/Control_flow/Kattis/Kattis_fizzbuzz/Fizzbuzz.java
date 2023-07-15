package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_fizzbuzz;

import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) System.out.println("FizzBuzz");
            else if (i % x == 0) System.out.println("Fizz");
            else if (i % y == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
