package day31Dateandtime;

import java.time.LocalTime;

public class C03_LocalTime {

	public static void main(String[] args) {
		//bir string ve bir int variable olusturalim
				// ve islem surelerini kiyaslayalim
				// verilen iki dogum tarihinin hangisinin daha once 
				// oldugunu bulunuz
		
		LocalTime saat =LocalTime.now();
	     
	     System.out.println("baslangic saati " + saat);
	     
	     int sayi=10;
	     
	     for (int i = 0; i < 1000; i++) {
			sayi++;
		}
	     LocalTime saatBitis =LocalTime.now();
	     double nanos=saat.getNano();
	     double nanosb=saatBitis.getNano();
	     System.out.println("int for loop  "+(nanosb-nanos));
	     
LocalTime saat1 =LocalTime.now();
	     
	     System.out.println("baslangic saati " + saat);
	     
	     String str="ali";
	     
	     for (int i = 0; i < 1000; i++) {
			str+=" ";
	     
	     }
	     LocalTime saat1b =LocalTime.now() ; 
	     double nanos1=saat1.getNano();
	     double nanosb2=saat1b.getNano();
	     System.out.println("string for loop  "+(nanosb2-nanos1));
	     
	     
	     
	     
	}

}
