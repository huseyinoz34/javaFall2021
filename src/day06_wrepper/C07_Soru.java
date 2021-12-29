package day06_wrepper;

import java.util.Scanner;

public class C07_Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen dikdortgenin bir kenarini girin");
		double kenar1=scan.nextDouble();
		System.out.println("lütfen dikdortgenin diger kenar uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girilen dikdortgen kare");
			
		}
		
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dortgen kare degil");
			
		}

	}
	

}
