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

//Time O(n), Space O(1)

package Arrays;

public class KadansAlgorithm {

	//This method does not work for the arrays having all negative integers.
	private static int maxSubArray1(int[] arr){
		int maxSoFar = 0;
		int maxEndsHere = 0;
		
		for(int i = 0 ; i < arr.length; i++){
			maxEndsHere += arr[i];
			if(maxEndsHere < 0) maxEndsHere = 0;
			if(maxSoFar < maxEndsHere) maxSoFar = maxEndsHere;
		}
		
		return maxSoFar;
		
	}
	
	//This works for all
	private static int maxSubArray(int[] arr) {
		int maxSoFar = arr[0], maxEndsHere = arr[0];
		for(int i = 1; i < arr.length; i++){
			maxEndsHere = Math.max(arr[i], maxEndsHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndsHere);
		}
		
		return maxSoFar;
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {-2, -1, -3, -4, -1, -2, -1, -5, -4};
		int[] arr2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxSubArray1(arr2));
		
		System.out.println(maxSubArray(arr1));
		System.out.println(maxSubArray(arr2));
	}
}
