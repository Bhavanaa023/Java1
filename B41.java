package pkg1;
public class B41 {
	private String name;
    private int age;

    public B41(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
    	B41 emp = new B41("John Doe", 30);
        
        // Implicitly calls Object.toString()
        System.out.println(emp.toString()); 
        // or simply emp(toString is implicitly called)
        
        // Implicitly calls Object.equals()
        B41 emp2 = new B41("John Doe", 30);
        System.out.println(emp.equals(emp2)); 
    }
}
    