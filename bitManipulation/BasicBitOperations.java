package bitManipulation;

public class BasicBitOperations {
	
	public static void shiftRightLeft(int num){
		System.out.println("Right Shift gets you half of the number: " + (num >> 1));
		System.out.println("Left Shift gets you double of the number: " + (num << 1));
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		shiftRightLeft(a);
		shiftRightLeft(b);
		System.out.println(16 & 15);
	}
	
}
