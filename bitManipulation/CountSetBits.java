package bitManipulation;

public class CountSetBits {

	public int countSetBits(int number){
		int count = 0;
		while(number > 0){
			count += number & 1;
			number >>= 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num1 = 6;;
		int num2 = 13;
		
		CountSetBits theCSB = new CountSetBits();
		System.out.println(theCSB.countSetBits(num1));
		System.out.println(theCSB.countSetBits(num2));
		
	}
	
}
