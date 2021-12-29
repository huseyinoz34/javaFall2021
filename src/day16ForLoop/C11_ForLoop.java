package day16ForLoop;

import java.util.Scanner;

public class C11_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
		//sonucu yazdiran bir program yaziniz

		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen iki sayi girin");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int kucuk=0;
		int buyuk=0;
		
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		} else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		int toplam=0;
		
		for (int i = kucuk; i <=buyuk; i++) {
			toplam+=i;
		}
		
		System.out.println("gordiginiz sayilarin toplami  :"+toplam);
		
		scan.close();
	}

}
