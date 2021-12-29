package day13StringManup;

public class C02_Replace {

	public static void main(String[] args) {
		// string olarak verilen 10000 sayisinin binden buyuk olup 
		//olmadigini yazdirin
String sonuc ="10.000";

sonuc=sonuc.replaceAll(".", "");

System.out.println(sonuc);
if (Integer.valueOf(sonuc)>1000) {
	System.out.println("bulunan sonuc 1000 den buyuk");
} else {
	System.out.println("bulunan sonuc 1000 den kucuk");
}

	}

}
