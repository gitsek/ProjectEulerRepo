package ProjectEuler;

public class SumOfMultiples {

	public static int sumOfMultipleOf3n5(int num) {
	
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			if ((i % 3 ) == 0 || (i %5) == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Sum of Multiple of 3 and 5 " + SumOfMultiples.sumOfMultipleOf3n5(1000));
	}

}
