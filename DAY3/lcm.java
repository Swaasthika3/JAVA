import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int a=20,b=4,i=2;
        while(true){
            if(i%a==0 && i%b==0){
                break;
            }
                i++;
            
        }System.out.println(i);
        //gcd(a, b) = gcd(b, a % b) until b = 0
        //lcm(a, b) = (a × b) / gcd(a, b)
        //         import java.util.Scanner;

        // public class LCMGCD {
        //     // Function to find GCD using Euclid's Algorithm
        //     public static int gcd(int a, int b) {
        //         while (b != 0) {
        //             int temp = b;
        //             b = a % b;
        //             a = temp;
        //         }
        //         return a;
        //     }

        //     // Function to find LCM
        //     public static int lcm(int a, int b) {
        //         return (a * b) / gcd(a, b);
        //     }

        //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
                
        //         System.out.print("Enter first number: ");
        //         int num1 = sc.nextInt();
                
        //         System.out.print("Enter second number: ");
        //         int num2 = sc.nextInt();
                
        //         int gcdValue = gcd(num1, num2);
        //         int lcmValue = lcm(num1, num2);
                
        //         System.out.println("GCD = " + gcdValue);
        //         System.out.println("LCM = " + lcmValue);
                
        //         sc.close();
        //     }
        // }


    }
}
