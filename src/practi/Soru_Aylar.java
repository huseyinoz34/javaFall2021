package practi;

import java.util.Scanner;

public class Soru_Aylar {

	private static String n;

	public static void main(String[] args) {
		/* Soru 5:
		 * Kullanicinin girmis oldugu  1 ile 12 arasindaki sayinin yilin hangi ayi oldugunu 
		 * yazdiran Switch Case java kodunu yaziniz.
		 */
Scanner scan =new Scanner(System.in);

		System.out.println("lutfen bir ay numarasi giriniz");
		
		System.out.println("ocak >> 1 "+"\n" +"subat >> 2 " +"\n" +"mart >> 3 " +"\n" +"nisan >> 4 " + 
				"\n" +"mayis >> 5 "+"\n" +"haziran >> 6 " +"\n" +"temmuz >> 7 " +"\n" +"agustos >> 8 " 
				+"\n" +"eylul >> 9 " +"\n" +"ekim >> 10 " +"\n" +"kasim >> 11 " +"\n" +"aralik >> 12 " );
				
		int ay=scan.nextInt();
		
		switch(ay) {
		
		case 1:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 2:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 3:
				System.out.println("girdiginiz ay: "+ay);
				break;
		case 4:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 5:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 6:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 7:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 8:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 9:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 10:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 11:
			System.out.println("girdiginiz ay: "+ay);
			break;
		case 12:
			System.out.println("girdiginiz ay: "+ay);
			default :
				System.out.println("gecersiz sayi");
			
			
			
			
		}
		
		
		
		
		
	}

}
