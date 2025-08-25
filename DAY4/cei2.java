import java.util.*;
class cei2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        String b;
        int flag=0;
        for(String c:n){
            if(c==","||c==";"||c==" "){
                continue;
            }
            b[c]=n[c];
        }
        for(char c=0,i=0;i<n.length ;c++,i++){
            
            if(b[c]!=n[i]){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }
}