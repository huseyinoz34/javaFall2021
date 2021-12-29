package day40exeption;

import java.util.Scanner;

public class C06_IllegalException {

	public static void main(String[] args) {
		// kullanicidan yasini girmesini isteyin
// sifirdan 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen konsolda gormek icin yasinizi girin");
		int yas=scan.nextInt();
		try {
			if (yas<0) {
				throw new IllegalArgumentException() ;
			} else {System.out.println(yas);

			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
		
		
	}

}
