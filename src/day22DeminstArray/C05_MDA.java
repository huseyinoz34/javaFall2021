package day22DeminstArray;

import java.util.Arrays;

public class C05_MDA {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime
		//sayisini yazdirin

		String cumle = "her sey javayla kolay";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler));
		System.out.println("girilen cumlede "+kelimeler.length+ " adet kelime var");
		
	}

}
