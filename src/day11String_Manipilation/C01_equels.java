package day11String_Manipilation;

public class C01_equels {

	public static void main(String[] args) {
	
		int a =10;
		int b= a+0;
		System.out.println(a==b);// true
		
		char ch1='K';
		char ch2= 'K'+0;
		
		System.out.println(ch1==ch2);
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		System.out.println(str4);
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));
		// string variable da == hem degere hemde referance bakar
		
		//objeler farkli oldugu icin false doner 
		// str1.equals(str2) ise sadece Stringin degeri ayni isetrue doner

	}

}
