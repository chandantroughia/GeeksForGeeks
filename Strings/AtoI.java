package Strings;


public class AtoI {
	
	public static int atoI(String str){
		
		
		    int result = 0;
		    for(int i = 0; i < str.length(); i++){
		        char ch = str.charAt(i);
		        if(Character.isDigit(ch))
		        {
		            result = result * 10 + (ch - '0');

		        }
		        else
		        {
		            return -1;
		        }
		    }
		    
		    return result;
		    //Your code here
		
		
		
	}
	
	public static void main(String[] args) {
		String str = "12a";
		System.out.println(atoI(str));
	}

}
