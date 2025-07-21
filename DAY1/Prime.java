public class Prime {
    public static void main(String args[]){
        int n=43,flag=0;
        for(int i=2;i<n;i++){
        if((n%i)==0){
            flag=1;
        }
    }
    if(flag==1){
        System.out.println("not prime");
    }
    else{
        System.out.println("prime");
    }
    }
}
