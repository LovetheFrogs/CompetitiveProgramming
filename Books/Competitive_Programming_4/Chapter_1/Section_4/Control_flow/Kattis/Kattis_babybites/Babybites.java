package Books.Competitive_Programming_4.Chapter_1.Section_4.Control_flow.Kattis.Kattis_babybites;

import java.util.Scanner;

public class Babybites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        String[] l = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) if (!l[i].equals("mumble") && Integer.parseInt(l[i]) != i + 1) flag = false;
        System.out.println(flag ? "makes sense" : "something is fishy");
    }
}
