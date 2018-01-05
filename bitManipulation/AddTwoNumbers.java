package bitManipulation;

public class AddTwoNumbers {
	
	private static int getAddition(int a, int b) {
		while(b > 0){
			int carry = a & b;
			a = a ^ b;
			b = carry << 1; 
		}
		return a;
	}
	
	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		
		System.out.println(getAddition(a, b));
	}

}
