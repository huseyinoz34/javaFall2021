package day22ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> harfler=new ArrayList<>();
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		harfler.add("D");
		
		System.out.println(harfler);
		
		harfler.remove(1);// harfler listesinde 1.indexi siler
		System.out.println(harfler);
		System.out.println(harfler.remove("C"));// consola true yazdiri
		harfler.add("A");
		harfler.remove("A");// sadece onune ilk gelen a yi siler
		harfler.removeAll(harfler);//butun listeyi siler
		

		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		harfler.add("D");
		
List<String> silinecekHarfler=new ArrayList<>();
		
silinecekHarfler.add("A");
silinecekHarfler.add("B");
silinecekHarfler.add("C");
silinecekHarfler.add("F");
		
		System.out.println(harfler.removeAll(silinecekHarfler));
		// true doner silinecekleri sildim der
		System.out.println(harfler);
		
	}
}
