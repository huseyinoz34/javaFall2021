package day40exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {

	public static void main(String[] args) {
		//kullanicidan istedigi kadar sayi alip 
		// bu sayilari toplayan bir program yapiniz
		// sayi girisini birirmek icin q ya basiniz

		int sayi=0;
		int toplam=0;
		int count=0;
		String secim="";
		Scanner scan=new Scanner (System.in);
		// InputMismatchException
		try {
			while (count<1000) {
				
				System.out.println("lutfen toplamak icin bir sayi giriniz\n bitirmek icin herhangi bir tusa ya basiniz");
			sayi=scan.nextInt();
			toplam+=sayi;
			count++;
			
			
			}
			
			
		} catch ( InputMismatchException e) {
			// normalde kullanici sayi disinda bir harf girdiginde java missmatch hata verir
		}
		
		System.out.println("sayilarin toplami  : "+toplam);
	}

}
