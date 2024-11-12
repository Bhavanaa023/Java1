package pkg1;
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class B35 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        	System.out.println("2+3 = " + math.add(2, 3));
        	System.out.println("2+3+4 = " + math.add(2, 3, 4));
        	System.out.println("2.5+3.5 = " + math.add(2.5, 3.5));
    }
}