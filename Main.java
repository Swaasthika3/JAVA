// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
       int n=110;
       for(int i=1;i<=n;i++){
           int arm=0,temp=i;
           while(i>0){
                int r=temp%10;
       arm=arm+(r*r*r);
       temp/=10;
       
           }
      
       
       if(arm==i){
           System.out.println(arm);
       }
       }
    }
}