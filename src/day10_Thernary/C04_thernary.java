package day10_Thernary;

import java.util.Scanner;

public class C04_thernary {
public static void main(String[] args) {
	
//	 Soru 3) Kullaniciya yasini sorun,
//         	eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
//			65’e esit veya buyukse “Emekli olabilirsin” yazdirin
	// her seferinde scanner olusturmak yerine 
	// test datalarimizi variable olarakda olusturabiliriz
	  // Soru2 : verilen karakteri inceleyin,
    // kucuk harf ise consola “Kucuk Harf” , 
    // buyuk harfse consola “Buyuk Harf” 
    // yoksa “girdiginiz karakter harf degil” yazdirin.
    
    char krk='&';
    
     // String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (//sart yanlis ise sonuc);
    String sonuc = (krk>='a' && krk<='z') ? "Kucuk Harf" : (
            
                    (krk>='A'&& krk<='Z') ? "Buyuk Harf" : "girilen karakter harf degil"
                        
                        );
    
    System.out.println(sonuc);

	
	

	                      
	
}
}
