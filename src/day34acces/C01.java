package day34acces;

public class C01 {
	
	private int sayiPrivate=10;
	// private class uyelerine sadece o klasdan olasilir
	 int sayiDefault=20;
	 //  ayni package ve ayni klasslardan ulasilir
	protected int sayiProtected=30;
	// protected class uyelerine ayni package baska package lardaki
	// childclass dan ulasilabilir
	public int sayipublic=40;
	// butun claslardan ulasilir

	public static void main(String[] args) {
		C01 sayi=new C01();
		System.out.println(sayi.sayiPrivate);
		
		System.out.println(sayi.sayiDefault);
		System.out.println(sayi.sayiProtected);
		System.out.println(sayi.sayipublic);
		
		sayi ();
		

	}


	private static void sayi() {
		// TODO Auto-generated method stub
		
		
		
		
	}

}
