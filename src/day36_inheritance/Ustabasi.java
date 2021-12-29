package day36_inheritance;

import day35encapslation.Isci;

public class Ustabasi extends Isci {

	Ustabasi(){
		System.out.println(" ustabasi constractor calisti");
	}
	  
	public static void main(String[] args) {
		Ustabasi ust1=new Ustabasi();
 //java da her class olustuldugunda otomatik olarak default olustugu gibi
		// child class da olustrulan her bir consruktor ilk satirinda
		// gizli super()olusturu
	}

}
