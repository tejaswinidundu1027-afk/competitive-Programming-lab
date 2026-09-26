import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] arr = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        
        boolean fractional = true;

        for (double x : arr) {
            if (x < 0 || x >= 1) {
                fractional = false;
                break;
            }
        }

        if (fractional) {

            
            ArrayList<Double>[] buckets = new ArrayList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new ArrayList<>();
            }

            for (double x : arr) {
                int index = (int)(x * N);
                buckets[index].add(x);
            }

            for (int i = 0; i < N; i++) {
                Collections.sort(buckets[i]);
            }

            boolean first = true;

            for (int i = 0; i < N; i++) {
                for (double x : buckets[i]) {

                    if (!first) {
                        System.out.print(" ");
                    }

                    System.out.printf("%.2f", x);
                    first = false;
                }
            }
        }
        else {

            
            Arrays.sort(arr);

            for (int i = 0; i < N; i++) {

                if (i > 0) {
                    System.out.print(" ");
                }

                
                if (arr[i] == (int) arr[i]) {
                    System.out.print((int) arr[i]);
                }
                else {
                    System.out.printf("%.2f", arr[i]);
                }
            }
        }

        System.out.println();

        sc.close();
    }
}
