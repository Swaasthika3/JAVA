public class Sll{
    class Node{
        int data;
        Node next;
        
   public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    Node start =null,end=null;
    void insert_begin(int data){
       // Node start=null,end=null;
       Node nn=new Node(data);
        if(start==null){
            start=nn;
            end=nn;
            return;
        }
        else{
        nn.next=start;
        start=nn;
        }
    }
    void insert(int data){
        Node nn=new Node(data);
        if(start==null){
            start=nn;
            end=nn;
            return;
        }
        

    }
    void display(){
        for(Node i=start;i!=null;i=i.next){
            System.out.print(i.data+" ");
        }
    }
public static void main(String[] args) {
    Sll s=new Sll();
    s.insert_begin(60);
    s.insert_begin(10);
    s.insert_begin(20);
    s.display();
    s.insert(30);
    
}
}
