import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int copy=n;
        int sum=0,count=0;
        while(n>0){
           
            n=n/10;
            count++;
            
        }
        n=copy;
        while(n>0){
            int r=n%10;
            int cube=1;
            for(int i=0;i<count;i++){
            cube=cube*r;
            }
           
            sum+=cube;
            n=n/10;
            
        }
        if(sum==copy){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
