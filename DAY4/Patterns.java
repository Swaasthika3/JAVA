import java.util.*;
class Patterns{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        System.out.println("2----------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
            System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        }
        System.out.println();
        }
        System.out.println("3----------");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
            System.out.print("*");
        
        }
        System.out.println();
    }
    System.out.println("4----------");
    for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
            System.out.print("*");
        
        }
        System.out.println();
    }
    System.out.println("5----------");
    for(int i=0;i<n;i++){
            for(int j=0;j<(n-1)-i;j++){
                 System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
            System.out.print("*");
        
        }
         System.out.println();
        
       
    }
    System.out.println("6----------");
    for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
            System.out.print(j+1+" ");
        
        }
        System.out.println();
    }
    System.out.println("7----------");
    for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
            System.out.print(j+1+" ");
        
        }
        System.out.println();
    }
    System.out.println("8----------");
    int val=1;
    for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
            System.out.printf("%2d  ",val);
            val++;
        }
        System.out.println();
    }
    System.out.println("9----------");
    for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                
            System.out.print((i+j)%2+" ");
        
        }
        System.out.println();
    }
    System.out.println("10----------");

        for(int i=0;i<n;i++){
            int ch=65;
            for(int j=0;j<i+1;j++){
                
            System.out.print((char)ch+" ");
        ch++;
        }
        System.out.println();
    }
    System.out.println("11----------");
    for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                 System.out.print("*");
            }
            for(int k=i+1;k<2*n-i;k++){
            System.out.print(" ");
        
        }
        for(int j=0;j<i+1;j++){
                 System.out.print("*");
            }
         System.out.println();
        
       
    }
      for(int i=n-1;i>=0;i--){
            for(int j=0;j<i+1;j++){
                 System.out.print("*");
            }
            for(int k=i+1;k<2*n-i;k++){
            System.out.print(" ");
        
        }
        for(int j=0;j<i+1;j++){
                 System.out.print("*");
            }
         System.out.println();
        
       
    }
    System.out.println("----------");
    }
}