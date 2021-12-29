package day07;

import java.util.Scanner;

public class C04_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        Verilen cinsiyet ve yas icin kisinin emekli olup olmayacagini
        yazdiran bir java programi yaziniz
        Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        calisan erkekse 65 yasindan buyukse emekli olabilir. 
        */
		
		Scanner scan=new Scanner(System.in);
    System.out.println("lutfen cinsiyetinizi girin\nerkek icin E,kadin icin K");
    char cinsiyet=scan.next().toUpperCase().charAt(0);
    if (cinsiyet !='E'&&cinsiyet !='K') {
		System.out.println("lutfen gecerli bir cinsiyet giriniz");
	}
    
       System.out.println("lutfen yasinizi girin");
       double yas=scan.nextDouble();
     if (cinsiyet== 'E') {
		if (yas>=65) {
			System.out.println("emekli olabilirsin");
		} else {
System.out.println("emekli olamazsin");
		}
	} else if(cinsiyet=='K'){
  if (yas>=60) {
	System.out.println("emekli olabilirsin");
} else {
System.out.println("emekli olamazsin");
}
	}else {
		System.out.println("lutfen bilgilerinizi tekrar girin");
	}
    
    
	}

}
