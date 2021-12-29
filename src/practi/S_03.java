package practi;

import java.util.Scanner;

public class S_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("adinizi giriniz");
		String name=scan.nextLine();
		
	
		System.out.println("soyadinizi giriniz");
		String surname=scan.nextLine();
	
		System.out.println("yasinizi girin");
		int age=scan.nextInt();
		
		System.out.println("boyunuzu giriniz");
		int boy=scan.nextInt();
		
		System.out.println("kilonuzu giriniz");
		int kilo=scan.nextInt();
		
		System.out.println("benim adim:"+ name+"\n "+" soyadim :"+surname
				+"\n+"+"yasim:"+age+"\n"
				+"boyum :"+boy+"cm"+
				"\n"+"kilom :"+kilo +"kg");
		
		
	}

}
