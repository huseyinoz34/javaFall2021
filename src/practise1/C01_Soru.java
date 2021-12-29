package practise1;

import java.util.Scanner;

public class C01_Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        /** indexOf()
         * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
         */ // contains den farkı indexini verir, contains ise true false
        // 012345678
		
		 /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim giriniz");
		String isim=scan.nextLine();
		char c1=isim.charAt(0);
		char c2=isim.charAt(0);		
		char c3=isim.charAt(0);
		
		if (isim.length()==3) {
			if (c1!=c2&&c2!=c3&&c3!=c1) {
				System.out.println("girilen isim 3 harfli ve unique");
			}else {
				System.out.println("girilen isim 3 harfli ve unique degil");
			}  
				System.out.println("girilen isim uc harfli degil");
			
				
			
			
		}else {
			System.out.println("girilen isim uc harfli degil");
		}
		
		String sonuc=isim.length()==3 ?( (c1!=c2 &&c2!=c3&&c3!=c1)?"girilen isim 3 harfli unique":"girilen isim 3 harfli ama unique degil"):"girilen isim 3 harfli degil";
		System.out.println(sonuc);
		
		
	}

}
