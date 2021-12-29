package day12;

import java.util.Scanner;

public class C03_LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanicidan bir cumle ve bir harf isteyin, 
				//harfin cumlede var olup olmadigini yazdirin
		
		// Kullanicidan bir cumle ve bir harf isteyin, 

		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen bir cumle giriniz");
		
		String cumle =scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir har girin");
		
		char krk=scan.next().charAt(0);
		
		int index =cumle.lastIndexOf(krk);
		
		if (index==(-1)) {
			System.out.println("harf cumlede kullanilmamistir");
		} else {
			System.out.println("harf cumlede kullanilmistir");

		}
		scan.close();
		
	}

}
