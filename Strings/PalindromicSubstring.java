package Strings;
import java.util.*;

public class PalindromicSubstring {
	
	private static int palindromicSubstring(String str){
		int start = 0;
		int n = str.length();
		boolean[][] palindrome = new boolean[n][n];
		int maxLength = 1;
		
		//for length 1
		for(int i = 0; i < n - 1; i++){
			palindrome[i][i] = true;
		}
		
		//for length 2
		for(int i = 0; i < n - 1; i++){
			if(str.charAt(i) == str.charAt(i + 1)){
				palindrome[i][i+1] = true;
				maxLength = 2;
				start = i;
			}
		}
		
		
		//for length >= 3
		for(int current = 3; current <= n; current++){
			for(int i = 0 ; i < n - current + 1; i++){
				int j = i + current -1;
				if(palindrome[i + 1][j - 1] && str.charAt(i) == str.charAt(j)){
					palindrome[i][j] = true;
					
					
					if(current > maxLength){
						maxLength = current;
						start = i;
					}
				}
			}
		}
		
		int count = 0;
		for(int i = 0; i < palindrome.length; i++){
			for(int j = 0; j < palindrome.length; j++){
				if(palindrome[i][j] == true) count++;
			}
		}
		System.out.println(count);
		return maxLength;
	}
	
	public static int longestSubSequene(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        
        for(Character key: map.keySet()){
        	if(map.get(key) > count){
        		count  = map.get(key);
        	}
        }
        return count;
	}
	

	public static void main(String[] args) {
		String str = "aabaa";
		System.out.println(palindromicSubstring(str));
		System.out.println(longestSubSequene(str));
	}

}
