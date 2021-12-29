package day16ForLoop;

import java.util.Scanner;

public class C_Faktoriyel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve 
		//girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen faktoriyel icin 10 dan kucuk sayi girin");
		
		int sayi=scan.nextInt();
		System.out.print(sayi+"! =");
		int faktoriyel=1;
		
		for (int i = sayi; i >0; i--) {
			faktoriyel*=i;
			System.out.print(i+"*");
		}
		System.out.println(" ="+faktoriyel);
		scan.close();
	}

}
