import java.util.Scanner;

// Author Rahib Amin
// Session 2 Assignment 1


public class HighestNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double max = 0;
	
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Enter your Numbers: ");
			int num = sc.nextInt();
			
			if (max < num) {
				max = num;
				
			}
			
		}
		
		System.out.println("Highest Number you have entered is: " + max);
	
	

	}

}
