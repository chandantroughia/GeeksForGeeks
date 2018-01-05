package bitManipulation;

public class PowerOfTwo {
	
	private static boolean answerWithBit(int num) {
		return ((num != 1) && (num & (num - 1)) == 0);
	}
	
	private static boolean ansWithout(int num){
		if(num == 0) return false;
		
		while(num != 1){
			if(num % 2 != 0){
				return false;
			}
			
			num = num/2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,4,6,8,9,16};
		System.out.println("Answers using bitwise operators:");
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + " = " + answerWithBit(numbers[i]));
		}
		
		
		System.out.println("Answers without using bitwise operators:");
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i] + " = " + ansWithout(numbers[i]));
		}
		
		
	}
}
