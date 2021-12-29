package day12;

import java.util.Scanner;

public class C04_lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// Kullanicidan bir cumle ve bir harf isteyin, 
						//harfin cumlede var olup olmadigini yazdirin
				
				// Kullanicidan bir cumle ve bir harf isteyin, 
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir kelime girin");
		
String kelime=scan.nextLine();
		
		int ilkEndex =cumle.indexOf(kelime);
		int sonEndex=cumle.lastIndexOf(kelime);
		
		if (ilkEndex<0) {
			System.out.println("kelime cumlede kullanilmamistir");
		} else if (ilkEndex==sonEndex) {
			System.out.println("kelime cumlede 1 kez kullanilmis");
		} else {
System.out.println("kelime cumlede birden fazla kullanilmis");
		} 

		
		scan.close();
		
		
	}

}
