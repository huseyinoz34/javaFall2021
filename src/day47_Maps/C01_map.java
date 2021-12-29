package day47_Maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_map {

	public static void main(String[] args) {
		// bir map olusturmadan once mapa koyacagimiz key value degerlerini 
		// incelemeliyiz data turunu secerken tum elemanlari koyabilecek data turu
		// secmeliyiz hemde elemanlari isleyecek basit data turu
		 
     // map i olustururken map in turunede karar vermeliyiz
		Map<Integer,String> sinif=new HashMap<>();
		sinif.put(101, "ali,can,j.dev");
		sinif.put(102,"veli,yan ,QA");
		sinif.put(103, "Ali ,yan,C#");
		
		int no=104;
		String isim="ayse";
		String soyisim="Can";
		String brans="QA";
		sinif.put(104, isim+", "+soyisim+ ", "+brans);
		System.out.println(sinif);
		
		System.out.println(sinif.get(102));
		System.out.println(sinif.keySet());// tum keyleri yazar
		// siniftaki ogrencileri bir listeye ekleyip yazdiralim
		
		
		
		List<String> valueList=new ArrayList<>(sinif.values());
		
		System.out.println(valueList);
		List<String> isimlistesi=new ArrayList<>();
		String bilgiler[]=new String[3];
		
		for (int i = 0; i < valueList.size(); i++) {
			bilgiler=valueList.get(i).split(", ");
			isimlistesi.add(bilgiler[0]);
		}
		
		System.out.println(isimlistesi);
		
	}

}
