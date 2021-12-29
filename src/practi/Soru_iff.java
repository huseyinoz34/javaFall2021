package practi;

import java.util.Scanner;

public class Soru_iff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
        // Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        //  dort islemden biri ile isleme koyup sonucun yazdiriniz
       
		Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen iki sayi giriniz");
		
		double sayi1=scan.nextDouble();
		
		double sayi2=scan.nextDouble();
		
		System.out.println("toplama icin 1 \n cikarma icin  2\n"
				+ "carpma icin 3 \n bolme icin 4");
		int islem=scan.nextInt();
		
		if (islem==1) {
			System.out.println("girdiginiz sayilarin toplami  :"+sayi1+sayi2);
		
		} 
		else if (islem==2){
System.out.println("girdiginiz sayilarin farki  :"+(sayi1-sayi2));
		}	
else if (islem==2){
System.out.println("girdiginiz sayilarin farki  :"+(sayi1-sayi2));
}
		
else if (islem==2){
System.out.println("girdiginiz sayilarin farki  :"+(sayi1-sayi2));
				
		
		
		
		
		
		
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
