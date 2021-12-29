package practise1;

import java.util.Scanner;

public class C05_Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc kelime bir isim giriniz");
		String isim=scan.nextLine();
		
		char ilk =isim.toUpperCase().charAt(0);
		char iki =isim.toUpperCase().charAt(isim.indexOf(" ")+1);
		char ucu=isim.toUpperCase().charAt(isim.lastIndexOf(" ")+1);
		
		System.out.println(""+ ilk+iki+ucu);
		
		
		
		
		
		
		
		
		

	}

}
