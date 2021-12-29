package day48map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class C02_Map {

	public static void main(String[] args) {
		//oru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak donduren bir method yaziniz.
	// mapè { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
	// Istenen dil è java
	// Sonuc è [Ali, Veli]
		
		
		Map<Integer,String>soruMap=MapOlustur.myMap();
String istenenDil="java";

dilBilenListesiOlustur(soruMap,istenenDil);




	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		
		
		
		
		List<String>dilBilenListesi=new ArrayList<>();
		
		return dilBilenListesi;
	}

}
