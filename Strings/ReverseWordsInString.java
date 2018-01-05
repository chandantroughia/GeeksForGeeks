package Strings;

import java.util.Scanner;

public class ReverseWordsInString {
	
	public static String reverseString(String str){
		String[] arr = str.split(" ");
		String ans = "";
		
		for(int i = 0; i < arr.length; i++){
			
			if( i == arr.length - 1){
				ans = arr[i] + ans;
			}
			else{
				ans = " " + arr[i] + ans;
			}
		}
		return ans;	
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		;
		System.out.println(reverseString(str));
	}

}
