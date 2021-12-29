package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		// 
		
		
		List <String> isimler=new ArrayList<>();
		System.out.println("bos liste :" +isimler);
		isimler.add("ali");
		
		System.out.println("bir eleman : " + isimler);
		isimler.add("veli");
// listenin sonuna ekler
		isimler.add(1, "ayse");
		System.out.println("bir eleman : " + isimler);
		List <String> liste2=new ArrayList<>();
		liste2.add("huseyin");
		liste2.add("isa");
		isimler.addAll(4, liste2);// index 4 yok ama en sona eklemek
		//icin ekledik
		
		isimler.addAll(liste2);
	}

}
