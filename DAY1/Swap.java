
public class Swap {
    public static void main(String[] args) {
    int a=10;
    int b=5;
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a "+a+"b "+b);
    int a1=10;
    int b1=5;
    a1=a1^b1;
    b1=a1^b1;
    a1=a1^b1;
    System.out.println("a "+a1+"b "+b1);
    //System.out.println(a1,b1);****error****
    }
}
