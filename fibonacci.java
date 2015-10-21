public class fibonacci {
	public int fibo(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 0;
		}
		int a = 0;
		int b = 1;
		for(int i = 1; i < n; i++) {
			int temp = b;
			//System.out.println(a);
			//System.out.println(temp);
			b = b + a;
			a = temp;
		}
		return b;
	}

	public static void main(String[] args){
		fibonacci fib = new fibonacci();
		System.out.println(fib.fibo(0));
		System.out.println(fib.fibo(1));
		System.out.println(fib.fibo(2));
		System.out.println(fib.fibo(3));
		System.out.println(fib.fibo(10));
		System.out.println(fib.fibo(15));
	}
}