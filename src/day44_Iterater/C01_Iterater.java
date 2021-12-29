package day44_Iterater;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterater {

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
	}

}
