package day44_Iterater;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List <String>liste=new ArrayList<>();
   
   
   
   liste.add("ali");
   liste.add("ayse");
   liste.add("fatma ");
   liste.add("emrah");
   
   System.out.println(liste);
   ListIterator li1=liste.listIterator();
   String temp= "";
   		
   
   
   while (li1.hasNext()) {
	   temp=(String)li1.next();
	li1.set(temp+"x");
	
}
   System.out.println(liste);
	}

}
