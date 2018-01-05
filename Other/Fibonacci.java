package Other;

public class Fibonacci {
	
	//Dinamic Programming
	public static int fib(int n){
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		int i;
		
		if(n == 0) return arr[0];
		if(n == 1) return arr[1];
		
		for(i = 2; i <= n; i++){
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}
	
	//Without space
	public static int fib2(int n){
		int a = 0;
		int b = 1;
		int c;
		if(n == 0) return 0;
		
		for(int i = 2; i <=n; i++){
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	
	public static void main(String[] args) {
		int n = 40;
		System.out.println(fib(n));
		System.out.println(fib2(n));
		
	}

}
