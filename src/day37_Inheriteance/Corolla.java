package day37_Inheriteance;

public class Corolla extends Toyota{
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
int tekerSayisi=4;
String uretimYeri="turkiye";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Corolla arb1=new Corolla();
// class ismi ayni zamanda data typt dir
Toyota  arb2=new Corolla();
System.out.println(arb2.uretimYeri);
Arabalar arb3=new Corolla();

	}
	

}
