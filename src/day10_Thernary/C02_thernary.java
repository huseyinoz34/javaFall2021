package day10_Thernary;

import java.util.Scanner;

public class C02_thernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi girin");
		 int sayi=scan.nextInt();
		System.out.println(sayi%2==0  ? "cift sayi"  :  "tek sayi");
		
		

	}

}
