package day38_overridding;

public class Kumes_Hayvanlari extends Kuslar {

	public static void main(String[] args) {

Kumes_Hayvanlari kms1=new Kumes_Hayvanlari();
kms1.beslenme();
kms1.hareket();
kms1.solunum();

Kuslar kms2=new Kumes_Hayvanlari();
kms2.beslenme();
kms2.hareket();
kms2.solunum();
	}
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
		
	}
	
	
}
