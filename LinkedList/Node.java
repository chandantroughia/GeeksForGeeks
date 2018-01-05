package LinkedList;

public class Node {

	public int value;
	public Node next;
	
	public Node(int v){
		value = v;
		next = null;
	}
	
	public void displayLink(){
		System.out.println(value);
	}
}
