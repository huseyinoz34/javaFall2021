package practi;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan 2 tam sayi alip bu iki tam sayinin islem so
		//aliniz
		Scanner scan =new Scanner(System.in);
		
		System.out.print("1.sayiyi giriniz  :");
		int sayi1=scan.nextInt();
		
		System.out.print("2.sayiyi giriniz  :");
		int sayi2=scan.nextInt();
		
		System.out.println("girilen sayilarin toplami :"+(sayi1+sayi2));
		System.out.println("girilen sayilarin toplami :"+(sayi1-sayi2));
		System.out.println("girilen sayilarin toplami :"+(sayi1*sayi2));
		System.out.println("girilen sayilarin toplami :"+(sayi1/sayi2));
		
		
		

	}

}
