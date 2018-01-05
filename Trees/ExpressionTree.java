package Trees;

import java.util.Stack;

public class ExpressionTree {
	
	//public Node root;
	
	public static Stack<Integer> theStack = new Stack<Integer>();
	
	
	public static void compute(Node node){
		if(node != null){
			compute(node.left);
			System.out.print(node.value + " ");
			compute(node.right);
			
			
			if(!isOperator(node.value)){
				theStack.push(Integer.parseInt(node.value));
			}else{
				int b = theStack.pop();
				int a = theStack.pop();
				char op = node.value.charAt(0);
				int tempResult = compute(op, a, b);
				theStack.push(tempResult);
			}
		}
	}
	
	
	

	
	public static boolean isOperator(String in){
		return (in.equals("+")||in.equals("/")||in.equals("*")||in.equals("-"));
	}
	
	public static int compute(char op, int a, int b){
		switch(op){
		case '+': return a+b;
		case '-': return a-b;
		case '/': return a/b;
		case '*': return a*b;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		Node theNode = new Node("+");
		theNode.left = new Node("*");
		theNode.right = new Node("*");
		theNode.left.left = new Node("2"); theNode.left.right = new Node("3");
		theNode.right.left = new Node("4"); theNode.right.right = new Node("5");
		compute(theNode);
		System.out.println("\nResult is:" + theStack.pop());
		
		
	}
}

class Node{
	Node left;
	Node right;
	String value;
	
	public Node(String in) {
		value = in;
		left = null;
		right = null;
	}
}