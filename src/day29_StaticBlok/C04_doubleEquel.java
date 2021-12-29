package day29_StaticBlok;

public class C04_doubleEquel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="mustafa";
		String str2="mustafa";
		
		String str3=new String("mustafa");
		String str4=new String("mustafa");
		
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3)); // true
		
	}

}
