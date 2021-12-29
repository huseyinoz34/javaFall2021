package day31Dateandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime tarihSaat=LocalDateTime.now();
		System.out.println(tarihSaat);
		tarihSaat.toString();
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern(" dd / MM / YYYY EE  HH  : mm");
		
System.out.println(duzenle.format(tarihSaat));

/* 
 format olustururken gun gun d dd DDD yilin kacinci gunu ise 
 E,>EE,EEE gun ismini
 ay(ay icin buyuk M dakika icin m kullanilir
 M basina o olmadan 
 MM aylari iki haneli
 MMM ay isminin uc harfi 
 MMMM ay isminin tamamini yazar
 saat 
 24 saat duzeninde H 12 saat duzeninde h 

*/





	}

}
