package day44_Iterater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03 {

	public static void main(String[] args) {
		List<Integer> liste=new ArrayList<> ();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(9);
		liste.add(10);
		System.out.println(liste);
		// index kullanmadan tum elemanlari 3 ekleyerek yazdirin
		Iterator ite1=liste.iterator();
		
		   while (ite1.hasNext()) {
			ite1.next();
			ite1.remove();
			
		}
		System.out.println(liste);
	}

}
