package day06_wrepper;

public class C02_Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strl1="Java";
		String strl2= "G�zel";
		int sayi1=5;
		int sayi2=4;
		
		// java G�zel 54
		System.out.println(strl1+" "+strl2 +" "+sayi1+sayi2);
		// java 5 guzel
		System.out.println(strl1+" "+sayi1+" "+strl2);
		//java 94
		System.out.println(strl1+" "+(sayi1+sayi2)+sayi2);
		// 54 G�zel
		System.out.println(""+sayi1+sayi2+" "+strl2);
		
		
		
		
	
		
		

	}

}
