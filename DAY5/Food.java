
public class Food {
	class Node{
		String item;
		int price;
	public Node(String item,int price) {
		this.item=item;
		this.price=price;
	}
	Node next;
	}
	Node start=null,end=null;
	void insert(String item,int price) {
		Node n=new Node(item,price);
		if(start==null) {
			start=n;
			end=n;
		}
		else {
			end.next=n;
			n=end;
		}
	}
	void display(){
      for(Node i=start;i!=null;i=i.next){
          System.out.println(i.item+"\t|"+i.price+"\t|");
      }
  }
	public static void main(String args[]) {
		Food f=new Food();
		f.insert("chats",39);
		f.insert("rice",30);
		f.insert("Biriyani",150);
	}
	
}

