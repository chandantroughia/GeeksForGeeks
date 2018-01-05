package Stacks;

import java.util.Stack;

public class SortAStackIncreasing {
	
	public static Stack<Integer> sortIncreasing(Stack<Integer> input){
		Stack<Integer> ans = new Stack<Integer>();
		//while the input stack is not empty do this
		while(!input.isEmpty()){
			
			//pop the element from input and save it as temp
			int temp = input.pop();
			
			//while ans is not empty and if the element at the top is bigger then the temp
			//we pop that element from the ans and put it back in the input stact.
			while(!ans.isEmpty() && ans.peek() > temp){
				input.push(ans.pop());
			}
			
			//push the temp in the ans
			ans.push(temp);
		}
		
		//return ans
		return ans;
	}
	
	
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.push(34);
	    input.push(3);
	    input.push(31);
	    input.push(98);
	    input.push(92);
	    input.push(23);
	    
	    System.out.println(sortIncreasing(input));
	}

}
