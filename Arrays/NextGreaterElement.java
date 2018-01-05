package Arrays;

import java.util.Stack;

public class NextGreaterElement {
	
	/*It is a stack based problem
	1) Push the first element to stack.
	2) Pick rest of the elements one by one and follow following steps in loop.
	….a) Mark the current element as next.
	….b) If stack is not empty, then pop an element from stack and compare it with next.
	….c) If next is greater than the popped element, then next is the next greater element for the popped element.
	….d) Keep popping from the stack while the popped element is smaller than next. next becomes the next greater element for all such popped elements
	….g) If next is smaller than the popped element, then push the popped element back.
	3) After the loop in step 2 is over, pop all the elements from stack and print -1 as next element for them.*/
	
	private static void printNGE(int[] arr, int len) {
		int element, next;
		//Make a stack to push the elements
		Stack<Integer> theStack = new Stack<Integer>();
		
		//push the first element from the array to the stack
		theStack.push(arr[0]);
		
		//for loop from the next element
		for(int i = 1; i < len; i++){
			//next will contain the next element in the array
			next = arr[i];
			
			//if the stack is not empty do the following
			if(!theStack.isEmpty()){
				//If the stack is not empty, pop the first element
				element = theStack.pop();
				
				//If the element is less then the next element in the array, print it
				while(element < next){
					System.out.println(element + "-->" + next);
					
					//error check again
					if(theStack.isEmpty()){
						break;
					}
					
					//keep doing this till the stack is empty
					element = theStack.pop();
				}
				
				//In case the element is larger than the next element in the array, push it to the stack
				if(element > next){
					theStack.push(element);
				}
			}
			
			//push the next to the stack now, so that we can find the next greater for this element
			theStack.push(next);
		}
		
		/*After we exit the for loop,  the elements left in the stack do not have any greater element in the array.
		 update the next to '-1' and print it along with the element.
		 */
		
		while(!theStack.isEmpty()){
			element = theStack.pop();
			next = -1;
			System.out.println(element + "-->" + next);
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 2, 25};
		int len = arr.length;
		printNGE(arr, len);
	}

}
