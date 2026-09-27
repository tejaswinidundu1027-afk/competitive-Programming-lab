import java.io.*;
import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int N = sc.nextInt();
        int [] c = new int[N];
        for(int i = 0;i < N;i++){
            c[i] = sc.nextInt();
        }
        int [] dp = new int[V + 1];
        Arrays.fill(dp,V + 1);
        dp[0] = 0;
        for(int i = 1;i <= V;i++){
            for(int x : c){
                if(x <= i){
                    dp[i] = Math.min(dp[i],dp[i - x]+1);
                }
            }
        }
        if (dp[V] == V+1){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[V]);
        }
    }
}
