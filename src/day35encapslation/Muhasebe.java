package day35encapslation;

public class Muhasebe extends Personel {
	
	public Muhasebe(){System.out.println("muhasebe constructor calisti");}
	
	protected	int saatucreti;
	protected	String statu;
	protected	int maas;
	
	public static void main(String[] args) {
		
		Muhasebe calisan2=new Muhasebe();
		calisan2.maas=1500;
	}
	public int maasHesapla() {
		int maas=8*25*saatucreti;
		return maas;
		
	}
	
}
