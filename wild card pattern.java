import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();

        int i = 0;
        int j = 0;

        int star = -1;
        int match = 0;

        while (i < str.length()) {

            
            if (j < pattern.length() &&
                (str.charAt(i) == pattern.charAt(j) ||
                 pattern.charAt(j) == '?')) {

                i++;
                j++;
            }

           
            else if (j < pattern.length() &&
                     pattern.charAt(j) == '*') {

                star = j;
                match = i;
                j++;
            }

           
            else if (star != -1) {

                j = star + 1;
                match++;
                i = match;
            }

        
            else {
                System.out.println(0);
                return;
            }
        }

        
        while (j < pattern.length() &&
               pattern.charAt(j) == '*') {

            j++;
        }

        if (j == pattern.length()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
