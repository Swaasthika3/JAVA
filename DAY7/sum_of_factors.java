package DAY7;

import java.util.Scanner;

//sum of factors of the given number
public class sum_of_factors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();int sum=0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
