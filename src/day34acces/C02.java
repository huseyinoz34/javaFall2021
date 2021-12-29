package day34acces;

public class C02 {

	public static void main(String[] args) {
		C01 sayi=new C01();
		// System.out.println(sayi.sayiPrivate);private acces lere 
		// baska klastan ulasilamaz
		System.out.println(sayi.sayiDefault);
		System.out.println(sayi.sayiProtected);
		System.out.println(sayi.sayipublic);
        sayilar ();
	}

	private static void sayilar() {
		C01 sayi=new C01();
		//System.out.println(sayi.sayiPrivate);
		System.out.println(sayi.sayiDefault);
		System.out.println(sayi.sayiProtected);
		System.out.println(sayi.sayipublic);
		
	}

}
