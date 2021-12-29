package day21;

import java.util.Arrays;

@SuppressWarnings("unused")
public class C02_Arrays {

	public static void main(String[] args) {
		
		// java ogrenmek cok guzel cumlesinin kelimelerini ters 
		// sirada yazdirin
		String cumle="java ogrenmek cok güzel";
		String kelimeler[]=cumle.split(" ");
		
		for (int  i = kelimeler.length-1;i>=0; i--) {
			System.out.println(kelimeler[i]);
		}
	}

}
