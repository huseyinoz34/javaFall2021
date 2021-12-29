package practi;

import java.util.Scanner;

public class Soru_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		/* Günün sorusu: if statement
	      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
	        ax^2 + bx + c;
	        Çözüm adımları
	        kullanıcıdan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
	        Delta = 0 => 1 tane kök vardır x = -b/2a
	        Delta < 0 ise kök yoktur.
	   */
		//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		String result =(sayi>0)?  (sayi<10)?("rakam"):("pozitif sayi)"):("negatif sayi");
		System.out.println(result);
		
	}

}
