package day18;

import java.util.Scanner;

public class C02WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kullanicidan bir sayi alin ve rakamlari toplamini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen rakamlaritoplamini bulmak icin bir tam sayi girin");

		int sayi=scan.nextInt();
		int rakamlarToplami=0;
		int rakam=0;
		while (sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
			sayi/=10;
		}
		System.out.println("girdiginiz sayinin rakamlar toplami  :"+rakamlarToplami);
		int sayi1=345;
		rakamlarToplami=0;
		String sayistr=""+sayi1;
		for (int i = 0; i < sayistr.length(); i++) {
			rakam=sayi1%10;
			rakamlarToplami+=rakam;
			sayi1/=10;
			
		}
			System.out.println(rakamlarToplami);
		
		
		scan.close();
		
	}

}
