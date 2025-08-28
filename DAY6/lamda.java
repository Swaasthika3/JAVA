@FunctionalInterface
interface Fun{
String show(String s);
String toString();//This alone not 
}
class lamda {
    public static void main(String[] args) {
String s="hellllooo";
    Fun f=new Fun(){
        public String show(String s) {
            return "Hi This is lamda func"+s;
        }
    };
f.show(s);
Fun f1=(String s1)->"Hi This is lamda func";
String r1=f1.show(s);
System.out.println(r1);
String r=f1.show(s);
System.out.println(r);
Runnable r2 = () -> System.out.println("Hello Java");
new Thread(r2).start();

}
}
