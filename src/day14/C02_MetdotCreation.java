package day14;

import java.util.Scanner;

public class C02_MetdotCreation {

	public static void main(String[] args) {
		//kullanicidan iki sayi isteyin 
		// sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri metod yazin
		// kullaniyica us sorun
		// 2 yazarsa kareleri toplamini yapan method 3 yazarsa kupler 
		//toplamini yapan methon calissin
Scanner scan=new Scanner(System.in);
System.out.println("lutfen iki sayin girin");
double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();

System.out.println("girilen sayilarin karelerin toplamini istiyorsaniz 2"
		+"\nkupler toplamini istiyorsaniz 3 girin");
    

int secim=scan.nextInt();
switch(secim) {

case 2:
	kareTopla(sayi1,sayi2);
	break;
	
	
case 3:
	kupTopla(sayi1,sayi2);
	break;
	default:
		System.out.println("lutfen uygun bir sayi giriniz");
}

	}

	private static void kupTopla(double sayi1, double sayi2) {
		double kuplerToplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
				System.out.println("girilen sayilarin kupleri toplami="+kuplerToplami);
		
	}

	private static void kareTopla(double sayi1, double sayi2) {
		// TODO Auto-generated method stub
		double karelerToplami=sayi1*sayi1+sayi2*sayi2;
		System.out.println("girilen sayilarin toplami ="+karelerToplami);
	}

	
		
	}


