package day36_inheritance;

import day35encapslation.Muhasebe;

public class Memur extends Muhasebe {

	
		// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		Memur memur1=new Memur();
      memur1.isim="hasan";
      memur1.saatucreti=16;
		memur1.maas=memur1.maasHesapla();
		System.out.println(memur1.isim+ "in maasi"+memur1.maas);
	}

}
