package day31Dateandtime;

import java.time.LocalDate;
import java.time.Month;



public class C01_DateTime {

	public static void main(String[] args) {
		//bir string ve bir int variable olusturalim
		// ve islem surelerini kiyaslayalim
		// verilen iki dogum tarihinin hangisinin daha once 
		// oldugunu bulunuz
		
	LocalDate tarih=LocalDate.now();
     System.out.println(tarih);
     System.out.println(tarih.getDayOfYear());
     System.out.println(tarih.getDayOfMonth());
     System.out.println(tarih.plusDays(30));
     System.out.println(tarih.plusYears(3).plusMonths(6).plusYears(4));
     System.out.println(tarih.minusYears(3).minusMonths(4));
     
     LocalDate dogumTarihi=LocalDate.of(1998, Month.JANUARY, 10);
     
	}

}
