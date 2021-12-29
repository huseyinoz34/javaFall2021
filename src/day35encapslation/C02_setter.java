package day35encapslation;

public class C02_setter {

	public static void main(String[] args) {
		// Togretmenler ogrencinin notunu girsin tum notlarini goremesin
		//ngecip gecemedigini gorsun

		C01 ogr1=new C01();
	
		System.out.println(ogr1.isGecerMi());
		
		ogr1.setNot(60);
		System.out.println(ogr1.isGecerMi());
		// ogrencinin norunu girebildik ama notlari goremedik 
		// set metodu ile girebildik ortalamasini get ile yazdirabildik
	}

}
