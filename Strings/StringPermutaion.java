package Strings;

public class StringPermutaion {
	
	static int count = 0;
	//Recursion problem
	
	private static int stringPermutaion(String str, int start, int end){
		if(start == end){
			System.out.println(str);
			count++;
		}
		else{
			for(int i = start; i <= end; i++){
				str = swap(str, start, i);//swap the elements
				stringPermutaion(str, start + 1, end);
				str = swap(str, start, i); //back tracking, used to get back the initial string before permutation
			}
		}
		return count;
	}
	
	private static String swap(String str, int i, int j){
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(stringPermutaion(str, 0, str.length() - 1));
	}
}
