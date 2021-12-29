package day29_StaticBlok;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByList {

	public static void main(String[] args) {
		// bir list olusturalim sonra list elemanlarini degistir metodu
		// yazip orada list bazi elemanlarini degistirelim
	// methot void olsun
		// main method a dondukten sonra yeniden list yazdiralim
		
		
		List<String> harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		listdegistir(harfler);
System.out.println("main methoda donunce list   :"+harfler);
	}
// javada list ve array gibi objeler icinde pass by value gecerlidir
	//yani farkli bir methodda array veya list yeni deger atamasi 
	// yaparsaniz orjinal Array list degismez
	private static void listdegistir(List<String> harfler) {
		// TODO Auto-generated method stub
		harfler.set(0, "D");
		System.out.println("degistirdigimiz list  :"+harfler);
	}

}
