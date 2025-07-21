import java.util.Scanner;

class Sumofarray {
    public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("enter array size");
    int n=s.nextInt();
    int[] arr=new int[n];
    System.out.println("enter array");
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    System.out.println("the sum of aray is"+sum);
}}
