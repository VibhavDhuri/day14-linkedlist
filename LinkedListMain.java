package linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();

		System.out.println("LINKED LIST");
		
		linkedlist.addLast(56);
		linkedlist.display();
		linkedlist.addLast(30);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
	}

}
