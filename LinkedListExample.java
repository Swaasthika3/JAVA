import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
        // Creating an empty LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);
        
     // Adding elements
        linkedList.add("Grapes");  // Adds at the end
        linkedList.addFirst("Mango");  // Adds at the beginning
        linkedList.addLast("Pineapple");  // Adds at the end

        // Removing elements
        linkedList.remove("Banana");  // Removes specified element
        linkedList.removeFirst();  // Removes first element
        linkedList.removeLast();  // Removes last element

        // Accessing elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Other operations
        System.out.println("Size of LinkedList: " + linkedList.size());
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());

        // Clearing the LinkedList
        linkedList.clear();
	}

}
