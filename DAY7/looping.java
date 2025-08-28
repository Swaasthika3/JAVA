package DAY7;

import java.util.Scanner;

//BRANCHING AND LOOPING
public class looping {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
