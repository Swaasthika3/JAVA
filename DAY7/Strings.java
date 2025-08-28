package DAY7;

import java.util.Scanner;

//Strings - count the vowels
public class Strings {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        int i=0,count=0;
        while(i<st.length()){
            if(st.charAt(i)=='A'||st.charAt(i)=='a'||st.charAt(i)=='E'||st.charAt(i)=='e'||st.charAt(i)=='I'||st.charAt(i)=='i'||st.charAt(i)=='O'||st.charAt(i)=='o'||st.charAt(i)=='U'||st.charAt(i)=='u'){
                count++;
            }
            i++;
        }
        System.out.println("Number of vowels: "+count);
    }
}
