//Super and this keyword

import java.util.Scanner;
class vehicle{
    int m=200;
}
class car extends vehicle{
    int m=1200;
    void newcar(){
System.out.println(super.m);
System.out.println(this.m);
    }
}

class Oops {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
car c=new car();
c.newcar();
}
}
