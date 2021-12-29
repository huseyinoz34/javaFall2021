package day44_Iterater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_iterater {

	public static void main(String[] args) {
		List<Integer> liste=new ArrayList<> ();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(9);
		liste.add(10);
		System.out.println(liste);
		// index kullanmadan tum elemanlari 3 ekleyerek yazdirin
		   for (Integer each : liste) {
			System.out.print(each+3+" ");
		}
		   System.out.println();
		   System.out.println(liste);
			
Iterator itel=liste.iterator();
for (int i = 0; i < liste.size(); i++) {
	System.out.println(itel.hasNext()+"****"+itel.next());
}



	}

}
