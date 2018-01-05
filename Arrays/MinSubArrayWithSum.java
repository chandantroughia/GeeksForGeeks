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

public class MinSubArrayWithSum {

	public static void minSubArrayWithSum(int []arr, int k) {

		int start = -1;
		int end = -1;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++){
			int curSum = 0;
			for(int j = i; j < arr.length && (j-i+1 < min); j++){
				curSum += arr[j];
				if(curSum == k){
					start = i;
					end = j;
					min = end - start +1;
					break;
				}
			}
		}
		
		if(start == -1 || end == -1){
			System.out.println("No sub array exists with sum = " + k);
			return;
		}
		
		while(start <= end){
			System.out.print(arr[start] + " ");
			start++;
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,1,1,-1,3,4};
		int k = 7;
		
		minSubArrayWithSum(arr, k);
	}
}
