import java.io.*;
import java.util.*;

public class Solution {

    public static String longestBorder(String s) {
        int n = s.length();

        for (int len = n - 1; len >= 1; len--) {

            String prefix = s.substring(0, len);
            String suffix = s.substring(n - len);

            if (prefix.equals(suffix)) {
                return prefix;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = longestBorder(s);

        System.out.println(result);
    }
}
