package divideAndConquer;
import java.util.*;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key) {
		
		Arrays.sort(arr);
		int mid;
		int left = 0;
		int right = arr.length - 1;
		
		while(true){
			mid = (left + right)/2;
			if(arr[mid] == key) return mid;
			else if(left > right) return -1;
			else{
				if(key < arr[mid]){
					right = mid - 1;
				}else{
					left = mid + 1;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {4,3,5,7,11,10,6};
		System.out.println(binarySearch(arr, 10));
	}

}
