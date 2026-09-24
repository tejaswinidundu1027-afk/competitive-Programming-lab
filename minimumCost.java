import java.io.*;
import java.util.*;

public class Solution {
    public static int minimumCost (int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int i,j;
        for(i = 1;i < n;i++){
            grid[i][0] += grid[i-1][0];
        }
        for(j = 1;j < m;j++){
            grid[0][j] += grid[0][j-1];
        }
        for(i = 1;i < n;i++){
            for(j = 1;j < m;j++){
                grid[i][j] +=  Math.min(grid[i-1][j], Math.min(grid[i][j-1], 
                                       grid[i-1][j-1]));
        
              }
        } 
        return grid[n-1][m-1];
    }      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] grid = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            System.out.println(minimumCost(grid));
    }
}
