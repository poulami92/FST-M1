package activities;

public class Activity2 {

	public static void main(String[] args) {
		
		int numbers[] = {10,77,10,54,-11,10};
		
		
		boolean result= addTens(numbers);
		System.out.println(result);

	}

	private static boolean addTens(int[] numbers) {
		
		int sum =0;
		int size = numbers.length;
		for(int i =0;i<size;i++) {
			
			if(numbers[i]==10) {
				
				sum=sum+numbers[i];
			}
		}
		
	   if(sum==30)
		   return true;
	   else 
		   return false;
	}

}
