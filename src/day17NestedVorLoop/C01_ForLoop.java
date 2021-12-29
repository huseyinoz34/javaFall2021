package day17NestedVorLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kullanicidan iki tam sayi isteyin ilk sayidan baslayarak iknci sayiya kadar 
		// ucer ucer saydirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("luttfen iki tam sayi girin");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		if (num1>num2) {
			for (int i = num1; i >num2; i-=3) {
				System.out.print(i+" ");
			}
		} else if (num2>num1) {
			for (int i =num1; i < num2; i+=3) {
				System.out.print(i+" ");
			}
		} else {
System.out.println("girilen sayilar esit");
		}

		
		
	scan.close();	
		
		
		
	}

}
