package day20;

public class C02_LoopVeraible {

	public static void main(String[] args) {
	
		
		int sayi=10;
		for (int i = 0; i < 6; i++) {
			@SuppressWarnings("unused")
			String isim="ali";
			System.out.println(sayi);
		}
	//	System.out.println(isim);loopun icinde olusturulan variable 
	//	sadece loopda kullanilabilir
		for (int i = 0; i < 10; i++) {
			@SuppressWarnings("unused")
			String isim ="veli";
		}

	}

}
