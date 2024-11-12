package pkg1;
class Factorial {
    public int factorial(int n) {
                if (n == 0) {
            return 1;
        }
        else {
        	return n * factorial(n - 1);
        }
    }
}

public class B36 {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int number = 5; 
        System.out.println("Factorial of " + number + " is: " + fact.factorial(number));
    }
}