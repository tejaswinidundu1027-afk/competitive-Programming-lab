import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pt = sc.nextLine();
        String str = pt + "$" + txt;
        char[] s = str.toCharArray();
        int[] z = new int[s.length];
        int i = 1;
        int L = 0, R = 0;
        while(i < s.length) {
            if(i <= R) {
                z[i] = Math.min(R - i + 1,z[i-L]);
            }
            while(i+z[i] < s.length && s[z[i]] == s[i+z[i]])
                z[i]++;
            if(i + z[i] - 1 > R) {
                 L = i;
                 R = i + z[i] - 1;
            }
            i++;
        }
        for(int j = 0;j < z.length;j++){
            if(z[j] == pt.length())
                System.out.println(j-pt.length()-1);
        }
    }
}
