package Problem;

class Fibo{
    public int recursive(int num){

        if(num == 0){
            return 0;
        }else {
            return num + recursive(num - 1);
        }

    }
}

public class RecursionAdd {
    public static void main(String[] args){

        Fibo fact = new Fibo();
        System.out.println("Sum of 5 is " + fact.recursive(5));
    }
}
