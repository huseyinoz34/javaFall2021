package day05matematikislemler;

import java.util.Scanner;

public class C04_Modules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen 4basamakli bi sayi girin");
		int sayi=scan.nextInt();
		//kullanicidan 4 basamakli bi sayyi alip rakamlar toplamini bul
	
		//sayi 573 olsun
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		
		sayi/=10;
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		
		sayi/=10;
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		
		sayi/=10;
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		
	
		

		System.out.println(rakamlarToplami);
		
		

	}

}
