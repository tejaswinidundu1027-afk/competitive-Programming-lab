import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int low = 0,high = dividend;
        int quotient = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*divisor == dividend){
                quotient = mid;
                break;
            }
            else if(mid*divisor < dividend){
                quotient = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(quotient);
    }
}
