package Problem;
import java.util.Scanner;
public class Primediv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime = sc.nextInt();
		boolean check = true;
		if(prime > 1){
			for(int i = 2; i < prime/2; i++) {
				if(prime%i == 0) {
					check = false;
					break;
				}
			}
		} else {
			System.out.println("Invalid Input");
			check = false;
		}
		
		if(check){
			System.out.println("isPrime");
		}else {
			System.out.println("Not a prime");
		}
		sc.close();
	}
}
