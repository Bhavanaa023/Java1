package pkg1;

class DivByZeroException extends Exception{
	public DivByZeroException(String message) {
		super(message);
	}
}

public class B43_Exception {
	public static void main(String[] args) {
		System.out.println("Exception");
		int nr=10;
		int dr=0;
		int result;
		try {
			if(dr==0) {
				throw new DivByZeroException("division by zero not allowed");
			}
		}
		catch(DivByZeroException e1) {
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2) {
			System.out.println(e2.getMessage());
		}
		finally {
			System.out.println("Finally block executed");
		}
	}
}
