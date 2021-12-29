package day33stringbuilder;

public class C03_equeals {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("java candir ");
		StringBuilder sb2=new StringBuilder("java candir ");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.compareTo(sb2));
		// sb da equals methodu Strindeki gibi calismaz
		
		
		// compare harflerden baslayarak bire bir sb leri karsilastirir 
		// egr tum karakterler ayni ise sonuc 0 doner
		
		String str="java ";
		//System.out.println(sb1==str); sb ile stringi == ile karsilastirilamay
	
		
		
		
		System.out.println(sb1.equals(str)); // false equals kabul etti);
		//System.out.println(sb1.compareTo(str)); kabul etmedi
		
		
		
		
	}

}
