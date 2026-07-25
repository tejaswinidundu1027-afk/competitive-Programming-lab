import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        while(B!=0){
            int sum = A^B;
            int carry = (A&B) << 1;
            A = sum;
            B = carry;
        }
        System.out.println(A);
    }
}
