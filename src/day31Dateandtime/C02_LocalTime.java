package day31Dateandtime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		// 
     LocalTime saat =LocalTime.now();
     
     System.out.println("baslangic saati " + saat);
     
     int sayi=10;
     
     for (int i = 0; i < 1000; i++) {
		sayi++;
	}
     
     LocalTime saatBitis=LocalTime.now();
     
     System.out.println("baslangic saati " + saatBitis);
     
     // eger bir islemin baslangic ve bitis zamanini kaydetmek 
     // istiyorsak hem basinda hemde sonunda localtime objesi
     // olusturmaliyiz
     
     System.out.println(saat.getNano());
     
	}

}
