package day10_Thernary;

import java.util.Scanner;

public class C01_Thernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullanicidan iki sayi alin büyük olmayan sayiyi yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi girin");
		double sayi1=scan.nextDouble();
		System.out.println("lutfen bir sayi daha girin");
		double sayi2=scan.nextDouble();
		
		System.out.println(sayi1>sayi2  ? sayi2    :sayi1);
		
		
		
		
		
		
	
	}

}
