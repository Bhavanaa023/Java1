package pkg1;
public class B24 {
	public static void main(String[] args) {
		String s1="Chandrashekar Rao Kuthyar";
		int len1=s1.length();
		System.out.println(s1);
		System.out.println("Length of the string is: "+len1);
		String s2=" ";
		System.out.println("Reverse order of string is :");
		for(int i=0;i<len1;i++){
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
				System.out.println(s2);
	}
}