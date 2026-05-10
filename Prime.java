package Problem;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int prime = sc.nextInt();
	        boolean value = true;

	        if (prime > 1) { // ✅ fixed condition
	            for (int i = 2; i < prime; i++) {
	                if (prime % i == 0) {
	                    value = false;
	                    break;
	                }
	            }
	        } else { // less than or equal to 1
	            value = false;
	            System.out.println("It is less than or equal to 1");
	        }

	        if (value) {
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not a prime");
	        }

	        sc.close();
	}
}
