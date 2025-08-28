package DAY7;

import java.util.Scanner;

public class palindrome {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String sn=s.next();
        StringBuilder sb=new StringBuilder(sn);
        String news=sb.reverse().toString();
        int flag=0;
        for(int i=0;i<sn.length();i++){
        if(news.charAt(i)!=sn.charAt(i)){
            flag=1;
        }
            }
        if(flag==1){
            System.out.println("Not a Palindrome");
        }
        else
            System.out.println("Palindrome");
    }
}
