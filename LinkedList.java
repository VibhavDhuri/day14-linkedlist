package linkedlist;

public class LinkedList {
	public Node head;

	public class Node {

		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;

		}
	}

	// pushing new data
	public void push(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;

		}
	}

	// Display all Node with Value
	public void display() {

		if (head == null) {
			System.out.println("List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		LinkedList operation = new LinkedList();

		operation.push(56);
		operation.push(30);
		operation.push(70);

		operation.display();
	}

}
