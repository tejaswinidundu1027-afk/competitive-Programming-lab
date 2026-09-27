import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        for(int i = 0;i < s.length();i++) {
            temp += s.charAt(i);
            int j = i+1;
            while(j < s.length()) {
                if(j + temp.length() > s.length())
                    break;
                if(!temp.equals(s.substring(j,j+temp.length())))
                    break;
                j = j+temp.length();
            }
            if(temp.length()!=0 && j == s.length()) {
                System.out.println(temp.length());
                return;
            }
        }
        System.out.println(s.length());
    }
}
    
