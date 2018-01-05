package bitManipulation;

/*Count the number of bits to be change/flip to change number A to number B*/

public class FlippedBitsCount {

	public static int getCount(int a, int b){
		int temp = a ^ b;
		int count = 0;
		while(temp > 0){
			count += temp & 1;
			temp >>= 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println(getCount(a,b));
	}
	
}
