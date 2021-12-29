package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// icice map olusturacaksak en icerdekinden baslamaniz tavsiye olunur

		Map<String,String> ogr1Map=new HashMap<>();
		ogr1Map.put("isim", "ali");
		ogr1Map.put("soyisim", "yan");
		ogr1Map.put("brans", "j.dev");
		
		Map<String,String> ogr2Map=new HashMap<>();
		ogr2Map.put("isim", "veli");
		ogr2Map.put("soyisim", "atak");
		ogr2Map.put("brans", "QA");
		
		Map<String,String> ogr3Map=new HashMap<>();
		ogr3Map.put("isim", "ayse");
		ogr3Map.put("soyisim", "sen");
		ogr3Map.put("brans", "QA");
		
		
		
		Map<Integer ,Map<String,String>>sinifMap=new HashMap<>();
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		System.out.println(sinifMap);
		
	}

}
