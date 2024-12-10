package pkg1;
import pkg2.MyPackage2;

class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}

public class B44_MyPackage {
	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage2 mypack2=new MyPackage2();
		mypack1.display();
		mypack2.display();
	}
}