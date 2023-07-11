package Books.Competitive_Programming_4.Chapter_1.Section_4.Multiple_test_cases.Kattis.Kattis_eligibility;

import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String name = sc.next();
            String st = sc.next();
            String dob = sc.next();
            int c = sc.nextInt();
            if (Integer.parseInt(dob.substring(0, 4)) >= 1991 || Integer.parseInt(st.substring(0, 4)) >= 2010) System.out.println(name + " eligible");
            else if (c > 40) System.out.println(name + " ineligible");
            else System.out.println(name + " coach petitions");
        }
    }
}
