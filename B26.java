package pkg1;
public class B26{
	public static String reverse(String s1){
		String s2="";
		int len1=s1.length();
		for(int i=0;i<len1;i++){
			s2=s2+s1.substring(len1-(i+1),len1-i);
		}
			return s2;
	}
	public static void main(String[] args) {
		String result="";
		result=reverse("Madan");
		System.out.println(result);
		System.out.println(reverse("Manikanta"));
	}
}