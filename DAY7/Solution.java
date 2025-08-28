package DAY7;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0, count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            num = sc.nextInt();
            if (num == -1) break;

            sum += num;
            count++;

            if (num < min) min = num;
            if (num > max) max = num;
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", avg);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
