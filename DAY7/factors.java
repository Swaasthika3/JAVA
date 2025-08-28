package DAY7;

import java.util.Scanner;

//Print all the factors of the given number.
public class factors {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        boolean first = true;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}
