package in.nit.workshop;

public class arrayOperation {
	
	public static void main(String[] args) {
		//get the sum of array elements
		int numbers[] = {2,6,3,8,9};
		int sum =0;
		for(int index = 0; index< numbers.length;index++) {
			sum = sum +numbers[index];
		}
		System.out.println("sum:"+sum);

		// even and odd //if condition
		for(int index=0;index<numbers.length;index++) {
				System.out.println("it is even numbers of index ");
		}else{
		System.out.println("it is odd numbers of index");
	
		
	}


}
