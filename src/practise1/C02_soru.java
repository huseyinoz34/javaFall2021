package practise1;

import java.util.Scanner;

public class C02_soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen email adresini giriniz");
		String mail=scan.nextLine();
		
		if (!mail.contains("@")) {
			System.out.println("gecerli bir e mail giriniz");
		} else if(mail.substring(mail.indexOf("@")+1).equals("gmail.com")) {
System.out.println("e mail basari ile onaylandi");
		}else {
System.out.println("boyle email adresi olmaz");
	}
	}
}
