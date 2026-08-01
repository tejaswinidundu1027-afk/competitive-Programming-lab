import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while(N>0){
            N = N & (N-1);
            count++;
        }
        System.out.println(count);
    }
}
