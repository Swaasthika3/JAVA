import java.util.*;
class cei{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int copy=n;
        //change for gn amount
        System.out.println("1000:"+n/1000);
        n=n%1000;
         System.out.println("500:"+n/500);
        n=n%500;
         System.out.println("200:"+n/200);
        n=n%200;
         System.out.println("100:"+n/100);
        n=n%100;
         System.out.println("50:"+n/50);
        n=n%50;
         System.out.println("20:"+n/20);
        n=n%20;
         System.out.println("10:"+n/10);
        n=n%10;
         System.out.println("5:"+n/5);
        n=n%5;
         System.out.println("2:"+n/2);
        n=n%2;
        System.out.println("1:"+n/1);
        n=n%1;
        n=copy;
        int change[]={1000,500,200,100,50,10,5,2,1};
        for(int i:change){
             System.out.println(i+" : "+(n/i));
             n %= i; 
        }
    }
}