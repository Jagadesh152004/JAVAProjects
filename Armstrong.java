package Problem;
import java.util.Scanner;


public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Armstrong number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		int original = num;
		int sum = 0;
		while (num > 0) {
			int remainder = num % 10;
			sum  = sum + remainder * remainder * remainder;
			num = num/10;
		}
		if(original == sum){
			System.out.println("It is a Armstrong");
		}else {
			System.out.println("Not a Armstrong");
		}
		sc.close();
	}
}
