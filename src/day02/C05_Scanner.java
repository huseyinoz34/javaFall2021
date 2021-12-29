package day02;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kullanicidan ad soyad isteyip girilen ad soyadi
		//yazdiriniz
		Scanner scan=new Scanner (System.in);
System.out.println("lutfen adinizi girin.....");

String isim=scan.next();
System.out.println("soyadinizi yaziniz");
 String soyisim=scan.next();
 System.out.println("girilen isim : "+isim  +" "+soyisim);
		 

	}

}
