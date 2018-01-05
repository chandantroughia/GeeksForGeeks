/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chandantroughia
 * @date 09/07/2017
 * 
 */

package Arrays;

public class MissingNumber {

	private static int missingNumber(int[] arr){
		int n = arr.length;
		int total = ((n)*(n+1))/2;
		//System.out.println(total);
		for(int i = 0; i < arr.length; i++){
			total -= arr[i];
			//System.out.println(total);
		}
		return total;
	}
	
	private static int missingNumberXor(int[] arr){
		int arrXor = 0;
		int actualXor = 0;
		
		for(int i = 0 ; i < arr.length; i++){
			arrXor ^= arr[i];
		}
		
		for(int i = 0; i < arr.length + 1; i++){
			actualXor ^= i;
		}
		
		return actualXor ^ arrXor;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 4};
		System.out.println(missingNumber(arr));
		System.out.println(missingNumberXor(arr));
	}
}
