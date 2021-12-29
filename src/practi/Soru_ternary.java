package practi;

import java.util.Scanner;

public class Soru_ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir pozitif sayi giriniz");
		
		int sayi=scan.nextInt();
		
		if (sayi>100 &&sayi<1000) {
			System.out.println("uc basamakli tam sayi");
		}else
		
			if (sayi%2==0) {
			System.out.println("sayiniz üc basamakli olmayan cift sayi");
		
			}else {
				System.out.println("sayiniz uc basamakli olmayan tek sayi");
			
			}
		
		
			

	}

}
