class Fib {
    public static void main(String[] args) {
        int n=5,f=0,s=1,t=0;
        System.out.print(f+"\t"+s+"\t");
        for(int i=2;i<n;i++){
            t=f+s;
            f=s;
            s=t;
            System.out.print(t+"\t");
        }

    }
    
}
