package day06_wrepper;

import java.util.Scanner;

public class C05_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan =new Scanner(System.in);
	System.out.println("lutfen bir sayi giriniz");
	double sayi=scan.nextDouble();
		
		if (sayi%2==0) {
			System.out.println("sayi cift ");
			
		}
		if (sayi%2==1) {
			System.out.println("sayi tek");
		}
		
		
		
		
	}

}
