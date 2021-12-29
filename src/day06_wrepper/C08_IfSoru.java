package day06_wrepper;

import java.util.Scanner;

public class C08_IfSoru {

	private static final String CUMARTESI = null;
	private static final String CUMA = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		//gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
		//ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		Scanner scan =new Scanner(System.in);
		System.out.println("bir gun giriniz");
		String gun=scan.nextLine().toUpperCase();
		if (gun.equals("CUMA")) {
			System.out.println("müslümanlar icin mubarek gun");
		}
		if (gun.equals("CUMARTESI")) {
			System.out.println("yahudileer icin mubarek gun");
		}
		
		if (gun.equals("PAZAR")) {
			System.out.println("Hristyanlar icin mubarek gun");
		}
		
		
		

}
	}

