package day13StringManup;

import java.util.Scanner;

public class C01_StartWith_EndWith {

	public static void main(String[] args) {
		// TODO kullanicidan bir cumle ve kelime alrak
		// cumlenin bu kelime ile baslayip baslamadigini yazdirin
		
      Scanner scan=new Scanner (System.in);
		
		System.out.println("lutfen bir cumle  giriniz");
		String cumle =scan.nextLine();
		System.out.println("lutfen bir kelime giriniz");
		String kelime =scan.next();
if (cumle.startsWith(kelime)) {
	System.out.println("girdiginiz cumle "+kelime+" ile basliyor");
} else {
	System.out.println("girdiginiz cumle "+kelime+"  ile baslamiyor");
}

if (cumle.endsWith(kelime)) {
	System.out.println("girdiginiz cumle "+kelime+" ile bitiyor");
} else {
	System.out.println("girdiginiz cumle "+kelime+"  ile bitmiyor");
}

		scan.close();
		
	}

}
