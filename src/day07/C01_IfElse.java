package day07;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise
		//sayilarin toplamini yazdirin, sayilarin ikisi de negative ise sayilari
		//carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse “farkli 
		//isaretlerde sayilarla islem yapamazsin” yazdirin, sayilardan sifira esit
		//olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.
		
	Scanner scan=new Scanner(System.in);
	System.out.println("lutfen ikisayi yaziniz \n ilk sayidan sonra enter basiniz");
	double sayi1 =scan.nextDouble();
	double sayi2 =scan.nextDouble();
	
	if (sayi1>0 && sayi2>0) {
		System.out.println("sayilarin toplami   :");
	} else if(sayi1<0 && sayi2<0) {
System.out.println("sayilarin carpimi  :"+sayi1*sayi2);
	}
	

		}
		
		

	}


