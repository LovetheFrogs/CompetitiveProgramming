package Books.Competitive_Programming_4.Chapter_1.Section_4.Still_easy.UVa_Judge.UVa_11786;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class UVa_11786 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int sol = 0;
            String s = br.readLine();
            Stack<Integer> sta = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '\\') sta.push(j);
                else if (s.charAt(j) == '/' && !sta.empty()) sol += j - sta.pop();
            }
            System.out.println(sol);
        }
    }
}
