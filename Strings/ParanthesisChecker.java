package Strings;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {
	
	static Stack<Character> theStack = new Stack<Character>();

	public static boolean isRight(char ch1, char ch2){
		if(ch1 == '}' && ch2 == '{') return true;
		else if(ch1 == ')' && ch2 == '(') return true;
		else if(ch1 == ']' && ch2 == '[') return true;
		return false;
	}
	
	public static boolean isBalanced(String str){
		char[] input = str.toCharArray();
		
		for(int i = 0 ; i < input.length; i++){
			if(input[i] == '{' || input[i] == '(' || input[i] == '['){
				theStack.push(input[i]);
			}
			
			else if(input[i] == '}' || input[i] == ')' || input[i] == ']'){
				if(theStack.isEmpty()) return false;
				else if(!isRight(input[i], theStack.pop())){
					return false;
				}
			}
			
			else{
				continue;
			}
		}
		
		if(theStack.isEmpty()) return true;
		else{
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(isBalanced(str));
	}
}
