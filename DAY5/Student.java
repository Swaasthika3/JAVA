public class Student {
	
	class Node {	
		String name;
		String dept;
		int num;
		Node next;
		public Node(String name,String dept,int num) {
			this.name=name;
			this.dept=dept;
			this.num=num;	
		}	
	}
	Node start=null,end=null;
	void add(String name,String dept,int num) {
		Node nn=new Node(name,dept,num);
		if(start==null) {
			start=nn;
			end=nn;
		}
		else {
			end.next=nn;
			end=nn;
		}
	}
    void display(){
        for(Node i=start;i!=null;i=i.next){
            System.out.println(i.name+"\t|"+i.dept+"\t|"+i.num);
        }
    }
	
	
public static void main(String args[]) {
	Student s=new Student();
    System.out.println("********************************");
	s.add("Ram","Cse",989685678);
	s.add("Raja","Cse",989685678);
	s.add("Shri","It",989685678);
	s.add("Anu","Cse",989685678);
    s.display();
    System.out.println("********************************");
}
}
