package bitManipulation;

public class LongestConsOnes {

	public static int getCount(int num){
		int maxCount = 0;
		int count = 0;
		
		while(num != 0){
			
			if((num & 1) == 1){
				count++;
			}
			else{
				maxCount = count;
				count = 0;
			}
			
			num = num >> 1;
		}
		
		return Math.max(maxCount, count);
	}
	
	public static void main(String[] args) {
		int num1 = 14;
		int num2 = 222;
		
		System.out.println(getCount(num1));
		System.out.println(getCount(num2));
		System.out.println(getCount(0));
	}
	
	
}
