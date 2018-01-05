package LinkedList;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList theList = new LinkedList();
		
		
		
		theList.insert(12);
		theList.insert(11);
		theList.insert(10);
		theList.insert(9);
		theList.insert(8);
		theList.insert(7);
		theList.insert(6);
		theList.insert(5);
		theList.insert(4);
		theList.insert(3);
		theList.insert(2);
		theList.insert(1);
		
		//Display the Linked List
		System.out.print("The Linked List is: ");
		theList.displayList();
		
		//Middle element of the Linked List
		System.out.println("The middle of the Linked List is: " + theList.midElement(theList.head).value);
		
		//Reversed Linked List:
		theList.reverseLD();
		System.out.print("The reversed Linked List is: ");
		theList.displayList();
		
		//Rotate a Linked List
		theList.rotate(3);
		System.out.print("The rotated Linked List is: ");
		theList.displayList();
		
		//Reverse a Lined List at give sets of size
		theList.head = theList.reverseInSets(theList.head, 3);
		System.out.print("The reverse (Set wise) Linked List is: ");
		theList.displayList();
		
	}
	
	
}
