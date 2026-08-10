import java.io.*;
import java.util.*;

public class Solution {
    public static void subsequence(String s){
        String t = "hackerrank";
        int j = 0;
        int k = 0;
        while(j < s.length() && k < t.length()) {
            if(t.charAt(k) == s.charAt(j))
                 k++;
            j++;
        }
        if(k == t.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        if(first.matches("\\d+")){
            int q = Integer.parseInt(first);
            for(int i = 0;i < q;i++){
            subsequence(sc.nextLine());
            }
        }
        else {
            subsequence(first);
        }
    }
}
