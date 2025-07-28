import java.util.Scanner;

public class perfectnos{
    public static void main(String[] args) {
        //28=1+2+4+7+14
       int n=29,sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else
        System.out.println("no perfect");
        
    }
}
