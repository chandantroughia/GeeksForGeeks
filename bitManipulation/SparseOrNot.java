package bitManipulation;

/*The idea to solve this question is to AND the number with its half (half can be obtained using right shifting the number)*/

public class SparseOrNot {
	
	public static boolean isSparse(int number){
		int half = number >> 1;
		int andResult = number & half;
		
		//if andResult is ZERO then the number is sparse otherwise not
		if(andResult == 0) return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSparse(12));
		System.out.println(isSparse(72));
	}
	
}
