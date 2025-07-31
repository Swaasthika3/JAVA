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
        int copy=n,rev=0,rev2=0;
        int square=n*n;
        while(n>0){
            int r=n%10;
            rev=(rev*10)+r;
            n=n/10;
        }
        int revsquare=rev*rev;
        //System.out.println(revsquare);
       
        while(revsquare>0){
            int r=revsquare%10;
            rev2=(rev2*10)+r;
            revsquare=revsquare/10;
            
        }
        if(rev2==square){
            System.out.println("Adam Number");
        }
        else{
            System.out.println("Not a adam number");
        }
    }
}
