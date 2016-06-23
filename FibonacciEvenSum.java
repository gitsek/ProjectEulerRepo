package ProjectEuler;

public class FibonacciEvenSum {

	public static int CalcEvenSumFibonnaci(int num) {
		int sum = 0;
		int n0 = 0;
		int n1 = 1;
		int temp = 0;
	    
		while(n1 < 4000000) {
			temp = n1;
			n1 = n0 + n1;
			n0 = temp;
			if((n1 % 2) == 0 ){
				sum += n1;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of Even fibonacci " + FibonacciEvenSum.CalcEvenSumFibonnaci(100));
	}

}
