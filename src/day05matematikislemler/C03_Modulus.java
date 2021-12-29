package day05matematikislemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan 3 basamakli bi sayi alip 
		//rakamlar toplamini yazdiralim
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen uc basamakli bi sayi girin");
		int sayi=scan.nextInt();
		//sayi 573 olsun
		int rakamlarToplami=0;
		int rakam=sayi%10;//birler basamagini bulduk
		rakamlarToplami+=rakam;
		// 57 yi bulmak icin sayiyi 10 boleriz
		sayi/=10;
		// sayi artik 57
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
			// sayi suan 57 7 ile isimiz bitti
		// 7 den kurtulmak icin 10 a boleriz
		
		sayi/=10;
		//sayi artik 5
		rakamlarToplami+=sayi;
		System.out.println(rakamlarToplami);
				
		
		
		

	}

}
