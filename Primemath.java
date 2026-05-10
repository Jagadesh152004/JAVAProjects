package Problem;
import java.util.Scanner;

public class Primemath {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int prime = sc.nextInt();
		boolean chk = true;
		if(prime > 0) {
			for(int i = 2; i <= Math.sqrt(prime); i++) {
				if(prime%i == 0) {
					chk = false;
					break;
				}
			}
		}else {
			System.out.println("Invalid number");
			chk = false;
		}
		if(chk) {
			System.out.println("isPrime");
		}else {
			System.out.println("Not a prime");
		}
		sc.close();
	}
}
