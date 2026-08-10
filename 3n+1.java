import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       int j = sc.nextInt();
       int n;
       int max = 0;
       for(n=i;n<=j;n++){
        int temp = n;
        int count = 1;
        while(temp!=1){
        if(temp%2==0){
            temp = temp/2;
        }
        else{
            temp = 3 * temp + 1;
        }
        count++;
       }
       if(count > max){
        max = count;
       }
       }
       System.out.println(i + " " + j + " " + max);
    }
}
