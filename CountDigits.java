package Problem;
import java.util.Scanner;
public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int count = sc.nextInt();
		int result = 0;
		while(count > 0) {
			result = result +1;
			count = count / 10;
		}
		System.out.println(result);
		sc.close();
		
		/*
		 int num = 123;
		 String s = n + ""; //force to covert the int value into string
		 System.out.println(s.length());
		 
		 123 => "123"
		 "123".length => 3 // it will find the how many character in "123"		 
		 output:
		 3
		  
		  
		 */
	}
}
