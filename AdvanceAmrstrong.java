package Problem;
import java.util.Scanner;
public class AdvanceAmrstrong {
	public static void main(String[] args) {
		
		// creating a object of that class 
		
		Scanner sc = new Scanner(System.in);
		
		// getting a input from the user
		
		System.out.print("Enter the number : ");
		int num  = sc.nextInt();
		
		// initialization for sum the raised to the power 
		int sum = 0;
		
		// storing the original value for comparision  
		
		int original = num;
		
		// converting integer value into string 
		String s = num + "";
		// taking out the length of the string and store it as int value
		int length = s.length();
		
		// checking the condition
		while(num > 0) {
			
			// taking the remainder of last digit
			int last = num % 10;
			
			// initialization for power to multiple 
			int power = 1;
			
			// looping for the number of digits to multiple no.of digits is length value
			for(int i = 0; i < length; i++) {
				
				//calculating the power to raised to the last digit  
				power = power * last;
			}
			
			// adding all the power to raised of power of all the digits
			sum = sum + power;
			
			// updating the value for next iteration 1234 => 123 which take quotient
			num = num / 10;
		}
		//checking the equal of original and sum of all powered digits
		
		if(original == sum){
			System.out.println("ArmStrong");
		}else {
			System.out.println("Not a Armstrong");
		}
		sc.close();
	}
}
