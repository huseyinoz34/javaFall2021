package day15;

import java.util.Scanner;

public class C02_Methodcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse, 
      //kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. Kullanici toplamak istedigi 
        //sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen toplamak istediginiz sayi adedini 2 3 4 den birini girin");
		int tercih =scan.nextInt();
		if (tercih>4) {
			tercih=5;
		}
		switch(tercih) {
		
		case 2:
			ikiSayiTopla();
			break;
			
		case 3:
			ucSayiTopla();
			break;
		case 4:
			dortSayiTopla();
			break;
		case 5:
			System.out.println("cok sayi girdiniz ben bunu toplayamam");
			break;
			default:
				System.out.println("gecersiz tercih");
		
		}
	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 4 sayi giriniz \n her sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();	
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		System.out.println("girdiginiz 4 sayinin toplami  :"+(sayi1+sayi2+sayi3+sayi4));
			
		
	scan.close();	
		
		
		
		
		
	}

	private static void ucSayiTopla() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 3 sayi giriniz \n her sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();	
		double sayi3=scan.nextDouble();
		System.out.println("girdiginiz 3 sayinin toplami  :"+(sayi1+sayi2+sayi3));
		
		
		scan.close();
		
		
	}

	private static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz \n her sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();	
	
		System.out.println("girdiginiz 2 sayinin toplami  :"+(sayi1+sayi2));
		scan.close();
	}

}
