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

public class ZeroOneTwos {
	
	
	public static void sort(int[] arr){
		int lo = 0;
		int hi = arr.length - 1;
		int mid = 0;
		int temp = 0;
		
		while(mid <= hi){
			switch(arr[mid]){
			case 0:{
				temp = arr[mid];
				arr[mid] = arr[lo];
				arr[lo] = temp;
				mid++;
				lo++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp = arr[mid];
				arr[mid] = arr[hi];
				arr[hi] = temp;
				hi--;
				break;
			}
			
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr);
		
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
