package Competitive_Programming_3.Chapter_1.Section_14.Games.UVa_00584;

import java.util.Scanner;

public class UVa_00584 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equals("Game Over")) break;
            String[] rolls = line.split(" ");
            int score = calculateScore(rolls);
            System.out.println(score);
        }
    }

    private static int calculateScore(String[] rolls) {
    }
}
