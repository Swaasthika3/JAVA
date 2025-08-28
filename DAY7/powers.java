package DAY7;

import java.util.Scanner;

// pow function using looping statement for  given base and power
public class powers {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();int b = s.nextInt();int exp=1;
        for (int i = 1; i <= b; i++) {
            exp=a*exp;
        }
          System.out.println(exp);
              
    }
}
