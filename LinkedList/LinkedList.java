package LinkedList;

public class LinkedList {
	Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void insert(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public Node find(int key){
		Node current = head;
		while(current.value != key){
			if(current.next == null){
				return null;
			}else{
				current = current.next;
			}
		}
		
		return current;
	}
	
	
	public Node delete(int key){
		Node current = head;
		Node previous = head;
		while(current.value != key){
			if(current.next == null){
				return null;
			}else{
				
				previous = current;
				current = current.next;
			}
		}
		
		if(current == head){
			head = head.next;
		}else{
			previous.next = current.next;
		}
		
		return current;
	}
	
	public void displayList(){
		Node current = head;
		while(current != null){
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	//Find the mid of a LinkedList
	
	public Node midElement(Node node){
		Node fast = node;
		Node slow = node;
		
		if(node == null)
			{
			return null;
			}
		else
			{
			while(fast != null && fast.next != null)
				{
					slow = slow.next;
					fast = fast.next.next;
				}
		}
		
		return slow;
	}
	
	//Reverse a LinkedList
	public void reverseLD(){
		Node current = head;
		Node next = null;
		Node previous = null;
		
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head = previous;
		
	}
	
	//Rotate a Linked list up to a given node
	public void rotate(int k){
		
		if(k == 0) return;
		
		Node current = head;
		int count = 1;
		
		while(count < k && current != null){
			current = current.next;
			count++;
		}
		
		if(current == null) return;
		
		Node KthNode = current;
		
		while(current.next != null){
			current = current.next;
		}
		
		current.next = head;
		head = KthNode.next;
		KthNode.next = null;
		
	}
	
	//Reverse a Linked List in the sets of a given value
	public Node reverseInSets(Node head, int k) {

		int count = 0;
		Node current = head;
		Node previous = null;
		Node next = null;
		
		//if(k ==0) return head;
		
		while(count < k && current != null){
			next= current.next;
			current.next = previous;
			previous = current;
			current = next;
			count++;
		}
		
		//At this point next is the Kth+1 node. Use recursion to do the rest;
		if(next != null){
			head.next = reverseInSets(next, k);
		}
		
		return previous;
	}
}
