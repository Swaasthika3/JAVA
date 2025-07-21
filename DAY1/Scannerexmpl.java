import java.util.Scanner;

public class Scannerexmpl {
    int a,b;
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Scanner s=new Scanner(System.in);
    Scannerexmpl sp=new Scannerexmpl();
    Scannerexmpl se=new Scannerexmpl();
    sp.a=s.nextInt();
    sp.b=s.nextInt();
    System.out.println(sp.a+"\t"+sp.b);
    se.a=s.nextInt();
    se.b=s.nextInt();
    System.out.println(se.a+"\t"+se.b);
    //diff scanner
    sp.a=sc.nextInt();
    sp.b=sc.nextInt();
    System.out.println(sp.a+"\t"+sp.b);
    }
}