import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Total number of notes:");
        int fivehundred=a/500;
        a=a%500;
        System.out.println("500 : "+fivehundred);
        int hun=a/100;
        a=a%100;
        System.out.println("100 : "+hun);
        int fif=a/50;
         a=a%50;
        System.out.println("50 : "+fif);
        int twe=a/20;
        a=a%20;
        System.out.println("20 : "+twe);
        int ten=a/10;
        a=a%10;
        System.out.println("10 : "+ten);
        int five=a/5;
        a=a%5;
        System.out.println("5 : "+five);
        int two=a/2;
    
        a=a%2;
            System.out.println("2 : "+two);
        int one=a/1;
        a=a%1;
        System.out.println("1 : "+one);
        
    }

}
