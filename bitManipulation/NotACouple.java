package bitManipulation;

/*This problem can also be stated as to return the number which is not repeated in an array*/

public class NotACouple {
	
	public static int getNotACouple(int[] arr){
		int number = 0;
		for(int i: arr){
			number ^= i;
		}
		
		
		return number;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,1};
		System.out.println(getNotACouple(arr));
	}

}
