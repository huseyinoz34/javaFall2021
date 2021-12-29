package day10_Thernary;

import java.util.Scanner;

public class C03_thernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kullanicidan bir sayi alip mutlak degerini yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi girin");
		double sayi1=scan.nextDouble();
		
		double mutlakDeger=sayi1>=0 ?  sayi1   : (-1)*sayi1;
		
System.out.println(mutlakDeger);
	}

}
