package Arrays;

public class ArrayRotation {
	
	private static  void rotateArray(int[] arr, int k) {
		k %= arr.length-1;
		reverse(arr, 0, arr.length-1);
		reverse(arr, arr.length - k, arr.length-1);
		reverse(arr, 0, arr.length - k - 1);
		
	}
	
	private static void reverse(int[] arr, int i, int j) {

		while(i<j){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
	

	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7}; //--> expected result {3,4,5,6,7,1,2}
		int k = 2;
		rotateArray(array, k);
		for(int i = 0 ; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
