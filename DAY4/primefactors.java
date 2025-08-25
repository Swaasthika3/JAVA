import java.util.Scanner;

public class primefactors {
     public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
        if(n%i==0 ){
          
            n=n/i;
        }
        else{
           
        }
        }
     }
}
//1.prime
//2.factor