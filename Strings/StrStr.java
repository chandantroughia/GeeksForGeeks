package Strings;

public class StrStr {
	
	public static int getStr(String a, String b){
		return (a).indexOf(b);
	}

	
	public static void main(String[] args) {
		String a = "GeeksForGeeks";
		String b = "sF";
		System.out.println(getStr(a, b));
	}
}
