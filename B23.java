package pkg1;
public class B23 {
	public static void main(String[] args) {
		System.out.print("Even numbers are ");
		System.out.println("");
		for(int i=0;i<=5;i++) {
			System.out.print(i*2+ " ");
		}
		System.out.println("");
		System.out.print("Odd numbers are ");
		System.out.println("");
		for(int i=0;i<=5;i++) {
			 System.out.print(i*2+1+" ");
		}
		System.out.println("");
		System.out.println("Multiples of i and j are ");
		
		for(int j=3;j<6;j++) {
			for(int i=0;i<=10;i++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
