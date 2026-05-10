package Problem;

import java.util.Scanner;
public class Sumdigits {
	public static void main(String[] args) {
		// sum of digits
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while(num > 0) {
			int last = num % 10;
			sum = sum + last;
			num = num / 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
