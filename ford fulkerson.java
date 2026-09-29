import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt(); 

        int[][] graph = new int[V][V];

    
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();
            graph[u][v] += c; 
        }

        int source = 0, sink = V - 1;
        int maxFlow = 0;

        while (true) {
            int[] parent = new int[V];
            Arrays.fill(parent, -1);

            Queue<Integer> q = new LinkedList<>();
            q.add(source);
            parent[source] = source;

            while (!q.isEmpty() && parent[sink] == -1) {
                int u = q.poll();
                for (int v = 0; v < V; v++) {
                    if (parent[v] == -1 && graph[u][v] > 0) {
                        parent[v] = u;
                        q.add(v);
                    }
                }
            }

            if (parent[sink] == -1) break;

            int pathFlow = Integer.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, graph[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                graph[u][v] -= pathFlow;
                graph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        System.out.println(maxFlow);
        sc.close();
    }
}
