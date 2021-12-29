package day11String_Manipilation;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equalsIgnorecase kucuk buyukharf gozetmez
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4=str1+" "+str2;//ali can
		System.out.println(str4);
		System.out.println(str3==str4);//false
		System.out.println(str3.equals(str4));//false degerleri farkli
		
		System.out.println(str3.equalsIgnoreCase(str4));// true icerik ayni
		
		

	}

}
