package day06_wrepper;

public class C01_Wrepper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int sayi1=10;
		Integer sayi2=20;
		
		// sayi1.yazdigimizda hicbir metod cikmadi int primitive dir
		// sayi2 yazdigimizda bir cok metod geliyor sayi2 Intiger dir
		// yani wrapper class dir
			
		String tel1="358345";
		String tel2="358765";
		
		System.out.println(tel1+tel2);// toplama yapmaz
		
		// bu sayilari toplamak istersek
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
	
		System.out.println(Double.MAX_VALUE);
		//String caddeNo="B203";
	     String caddeNo="203";
		String sokakNo="1564";
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		// Integer.valueof(String numerik  ifade methodu string olarak kaydedilmis
		// numerik ifadeleri sayiya cevirir ancak string icerisindee numerik
		// olmayan bi karekter olursa NumberFormatException hatasi verr
		// java calismayi durdurur stops exucution
		
		
		

	}

}
