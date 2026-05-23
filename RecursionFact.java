package Problem;

class Recursion{
 public int factorial(int n){

  if(n == 1 ) {
   return 1;
  }else {
   return n * factorial(n -1 );
  }

  }
}


public class RecursionFact {
 public static void main(String[] args){
  int num = 5;
  Recursion fact = new Recursion();
  System.out.println("Factorial of " + num + " is " + fact.factorial(5) );
 }
}
