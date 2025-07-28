
public class ShoppingCart {
	LinkedList items=new LinkedList();;
	
	// public ShoppingCart() {
	// 	this.items = new LinkedList();
	// }
	
	public void addItem(String itemName) {
		this.items.append(itemName);
	}
	
	public void removeItem(String itemName) {
		this.items.remove(itemName);
	}
	
	public void printItems() {
		this.items.printList();
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem("Shirt");
		cart.addItem("Jeans");
		cart.addItem("Jacket");
		
		cart.printItems();
		
		cart.removeItem("Jeans");
		
		cart.printItems();
	}

}
