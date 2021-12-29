package day35encapslation;

public class Personel {
	
	
	Personel(){System.out.println("personel construcktor calisti");}
	protected String isim;
	protected String soyIsim;
	protected String telNo;
	protected boolean calisiyorMu;
	protected int yas;
	public static void main(String[] args) {
		Personel calisan1=new Personel();
		
		
		
		
	}
	
	
// eger variabllara ecces modifer yazmazsak default olur sadece packege
	// dan kullanilir o yuzden protected atarsak baska package lardan 
	// child lar datalari kullanabilir
}
