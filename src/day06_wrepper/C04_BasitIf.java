package day06_wrepper;

import java.util.Scanner;

public class C04_BasitIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
        
      
   

		Scanner scan =new Scanner(System.in);
		System.out.println("lütfen gün isimlerinden birinin ilk harfini giriniz");
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		System.out.println(ilkHarf);
	if (ilkHarf=='P') {
		System.out.println("pazar,pazartesiveya persembe");
		
		
	}
   if (ilkHarf=='S') {
	   System.out.println("sali");
	
}
	if (ilkHarf=='C') {
		System.out.println("carsamba ,cuma veya cumartesi");
	}	
	if (ilkHarf!='C'&& ilkHarf!= 'P'&&ilkHarf!='S') {
		Scanner scan1 =new Scanner(System.in);
		System.out.println("lutfen gun adi olan bir harf giriniz");
		char ilkHarf1=scan1.next().toUpperCase().charAt(0);
	}

	}

}
