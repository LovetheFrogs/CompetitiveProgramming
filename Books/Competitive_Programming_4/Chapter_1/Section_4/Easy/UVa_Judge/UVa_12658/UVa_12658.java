package Books.Competitive_Programming_4.Chapter_1.Section_4.Easy.UVa_Judge.UVa_12658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UVa_12658 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = null;
        for (int i = 0; i < 5; i++) {
            if (i == 3) s = br.readLine();
            else br.readLine();
        }
        ArrayList<String> nums = new ArrayList<>();
        StringBuilder nn = new StringBuilder();
        for (int i = 0; i < n * 4; i++) {
            if ((i + 1) % 4 == 0) {
                nums.add(nn.toString());
                nn = new StringBuilder();
            } else nn.append(s.charAt(i));
        }
        for (String f : nums) {
            if (f.equals(".*.")) System.out.print("1");
            else if (f.equals("*..")) System.out.print("2");
            else System.out.print("3");
        }
        System.out.println();
    }
}
