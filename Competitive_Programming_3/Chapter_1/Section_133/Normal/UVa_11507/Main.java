package Competitive_Programming_3.Chapter_1.Section_133.Normal.UVa_11507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = br.readLine()) != null && !s.equals("0")) {
            String fin = "+x";
            int l = Integer.parseInt(s);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < l - 1; j++) {
                String d = st.nextToken();
                if (d.equals("+z")) {
                    if (fin.equals("+x")) fin = "+z";
                    else if (fin.equals("+z")) fin = "-x";
                    else if (fin.equals("-x")) fin = "-z";
                    else if (fin.equals("-z")) fin = "+x";
                } else if (d.equals("-z")) {
                    if (fin.equals("+x")) fin = "-z";
                    else if (fin.equals("+z")) fin = "+x";
                    else if (fin.equals("-x")) fin = "+z";
                    else if (fin.equals("-z")) fin = "-x";
                } else if (d.equals("+y")) {
                    if (fin.equals("+x")) fin = "+y";
                    else if (fin.equals("+y")) fin ="-x";
                    else if (fin.equals("-x")) fin ="-y";
                    else if (fin.equals("-y")) fin = "+x";
                } else if (d.equals("-y")) {
                    if (fin.equals("+x")) fin = "-y";
                    else if (fin.equals("+y")) fin = "+x";
                    else if (fin.equals("-x")) fin = "+y";
                    else if (fin.equals("-y")) fin = "-x";
                }
            }
            System.out.println(fin);
        }
    }
}
