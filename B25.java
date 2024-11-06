package pkg1;
public class B25 {
	public static void reverse(String s1) {
		String s2="";
		int len1=s1.length();
		System.out.println("String is: "+s1);
		System.out.println("length of the string is: "+len1);
		System.out.println("Reverse order of string is :");
		for(int i=0;i<len1;i++) {
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
        System.out.println(s2);
	}

	public static void main(String[] args) {
		reverse("Chandrashekar Rao Kuthyar");
	}
}