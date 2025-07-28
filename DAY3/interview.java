import java.util.Scanner;

public class interview {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();//10
        a=a++ + ++a;//22
        System.out.println(a);
    }
}
