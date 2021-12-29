package day16ForLoop;

import java.util.Scanner;

public class C00_Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stubInterview Question Kullanicidan bir String
		//isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
		//bir program yazin.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle girin");
		String str=scan.nextLine();
		
		
		if (str.equals(ters(str))) {
			System.out.println("girdiginiz kelime palidromdur");
		} else {
System.out.println("girdiginiz kelime palidron degildir");
		}
		
		
		
	}
	private static String ters(String str) {
		// TODO Auto-generated method stub
		String tersstr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			tersstr+=str.substring(i,i+1);
		}
		
		return tersstr;
		
	
	}
}
