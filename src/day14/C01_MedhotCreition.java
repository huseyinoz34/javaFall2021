package day14;

public class C01_MedhotCreition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// verilen iki sayinin toplamini ve carpimini yapip yazdiran
		// iki ayri metod olusturun
		// method olusturmak icin 3 adim takip edin 
		// 1.adim method call
		// 2.adim methoda arguman yazacakmiyiz
		// 3.adim 1. ve 2. adimi yaptiktan sonra javdan yardim alip methodu
		// olustururuz
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1,sayi2);// method call dur
		
		carpma (sayi1 ,sayi2);
		

	}

	private static void carpma(int sayi1, int sayi2) {
		System.out.println(sayi1*sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		// 4 adim erisim duzenleyici ve return type karar vermeliyiz
		// erisim duzenleyici axess modfier
		System.out.println(sayi1 +sayi2);
	}

}
