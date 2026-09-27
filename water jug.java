import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        if(T <= (A+B) && T%gcd(A,B)==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
