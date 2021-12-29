package day02;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class C06_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//scanner isleminde string icin 2 method vardir
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen adinizi girin.....");

		String isim=scan.nextLine();
		System.out.println("soyadinizi yaziniz");
		 String soyisim=scan.nextLine();
		 System.out.println("girilen isim : "+isim  +" "+soyisim);
	}

}
