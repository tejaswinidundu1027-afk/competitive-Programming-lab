import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String pt = sc.nextLine();
        String[] s = a.split(",");
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            int j = 0;
            int k = 0;
            while(j < s[i].length() && k < pt.length()) {
                if(s[i].charAt(j) >= 'A' && s[i].charAt(j) <= 'Z') {
                    if(s[i].charAt(j) != pt.charAt(k))
                        break;
                    j++;
                    k++;
                }
                while(j < s[i].length() && (s[i].charAt(j) >= 'a' && s[i].charAt(j) <= 'z'))
                    j++;
            }
            if(k == pt.length())
                li.add(s[i]);
        }
        if(li.size() == 0)
            System.out.print("No match found");
        else {
            Collections.sort(li);
            for(String x : li)
                System.out.println(x);
        }
    }
}
    
