package day15;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
	// kullanicidan ismini ve soyismini isteyin
	// iki farkli method olusturun methodlardan biri girilen kelimeleri
	//   ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
	// Ikinci method Isim ve soyismin ilk harfleri buyuk harf,
//   kalan harfler * olacak sekilde birlestirsin
				
// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde kullanin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen adinizi girin");
		String isim=scan.next();
		System.out.println("lutfen ad soyadinizi girin");
		String soyIsim=scan.next();	
		
		System.out.println("isminizin acik olarak yazilmasini istiyorsaniz1"
				+"\n ilk harf haric gizli yazilmasini istiyorsaniz 2 girin");
		int tercih=scan.nextInt();
		String birlesmisIsim=null;
		if (tercih==1) {
			birlesmisIsim=acikIsim(isim,soyIsim);
			System.out.println(birlesmisIsim);
		} else if(tercih==2) {
birlesmisIsim=isimGizle(isim,soyIsim);
System.out.println(birlesmisIsim);
		} else {
			System.out.println("lutfen 1 veya 2 secin");
			scan.close();
		}
		
		
	}

	private static String isimGizle(String isim, String soyIsim) {
		// TODO Auto-generated method stub
		
		isim=isim.substring(0,1).toUpperCase() +isim.substring(1).replaceAll("\\w", "*");
		soyIsim=soyIsim.substring(0,1).toUpperCase() +soyIsim.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyIsim;
		
	}

	private static String acikIsim(String isim, String soyIsim) {
		
		
		isim=isim.substring(0,1).toUpperCase() +isim.substring(1).toLowerCase();
		soyIsim=soyIsim.substring(0,1).toUpperCase() +soyIsim.substring(1).toLowerCase();
		
		
		return(isim+"  "+soyIsim);
		
	}

}
