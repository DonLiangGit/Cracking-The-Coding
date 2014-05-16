// Basic Fibonacci Function
// The running time of this function to calculate a number after 40th will be increasingly as 2**n. 
public static int Fibonacci (int n){
	if ( n < 0 ){
		System.out.println("Input Error");
		return 0;
	}
	else if ( n == 0 ){
		return 0; 
	}
	else if ( n == 1 ){
		return 1;
	}
	else{
		return Fibonacci[n-1] + Fibonacci[n-2];
	}
}
// Improved Fibonacci Function
// Tweak the Fib function run in O(n) time.
int[] fib = new int[max]
public static int Fibonacci (int n){
	if ( n < 0 ){
		System.out.println("Input Error");
		return 0;
	}
	else if ( n == 0 ){
		return 0; 
	}
	else if ( n == 1 ){
		return 1;
	}
	else if ( Fibonacci[n] != 0 ){
		return Fibonacci[n]; // return the cached result so that it will not caculate extra rounds.
	}
	Fibonacci[n] = Fibonacci[n-1] + Fibonacci[n-2]; // cache the fibonacci result
	return Fibonacci[n];
}