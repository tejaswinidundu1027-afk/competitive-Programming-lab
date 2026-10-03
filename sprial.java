import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] arr = new int[n][m];
        for(int i = 0;i < n;i++)
            for(int j = 0;j < m;j++)
                arr[i][j] = scn.nextInt();
                
        int sr = 0,sc = 0;
        int er = n-1,ec = m-1;
        
        while(sr <= er)
        {
            for(int i = sr,j = sc;j <= ec;j++)
                System.out.print(arr[i][j] + " ");
            sr++;
            for(int j = ec,i = sr;i <= er;i++)
                System.out.print(arr[i][j] + " ");
            ec--;
            for(int i = er,j = ec;j >= sc;j--)
                System.out.print(arr[i][j] + " ");
            er--;
            for(int j = sc,i = er;i >= sr;i--)
                System.out.print(arr[i][j] + " ");
            sc++;
        }
    }
}




1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
