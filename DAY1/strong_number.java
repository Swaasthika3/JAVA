import java.util.Scanner;

public class strong_number {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int copy=n;
        int fact=1,sum=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
        }
        n=copy;
        if(sum==copy){
            System.out.println("Strong Number");
        }
        else
             System.out.println("Not a strong number");
    }
}
