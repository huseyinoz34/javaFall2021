package practi;

import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bes basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
				
		int birler=sayi%10;
		
		int onlar =((sayi/10)%10);
		
		int binler =((sayi/1000)%10);
		
		int onBinler =((sayi/10000)%10);
		System.out.println("sayilarin toplami  : "+(birler+onlar+binler+onBinler));

	}

}
