package practi;

import java.security.DomainCombiner;
import java.util.Scanner;

public class C01switchCase {
public static void main(String[] args) {
	
	int bakiye=1000;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("lütfen yapacaginiz islemi seciniz");
	System.out.println("1  : para yatirma ");
	System.out.println("2  : para cekme ");
	System.out.println("3 : bakiye sorma ");
	System.out.println("4  : sistemden cikis ");
	
	int islem=scan.nextInt();
	
	switch(islem) {
	case 1:
	System.out.println("yatirilacak mikteri giriniz");
	break;
	case 2:
		System.out.println("yatirilacak mikteri giriniz");
		int miktar=scan.nextInt();
		bakiye+= miktar;
		break;
	case 3:
		System.out.println("bakiyeniz :"+bakiye );
		break;
	case 4:
		System.out.println("sistemden cikiliyor");
		
	default:
		System.out.println("gecersiz islem");
	
		
		
		
	}
}
}
