import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int visited = 0;
        int dupli = 0;
        for(char ch : s.toCharArray()){
            int A = ch - 'a';
            int k = 1<<A;
            if((visited & k) != 0){
                if((dupli & k) == 0){
                    System.out.print(ch + " ");
                    dupli |= k;
                }
            }
            else{
                visited |= k;
            }
            
        }
    }
}
