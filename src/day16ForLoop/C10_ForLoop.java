package day16ForLoop;

import java.util.Scanner;

public class C10_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle girin");
		String str=scan.nextLine();
		System.out.println(ters(str));
	
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
