package practi;

import java.util.Scanner;

public class Soru_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*1oo)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman k170ategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
         Scanner scan =new Scanner(System.in);
		
		System.out.println("lutfen boyunuzu cm giriniz");
		double boy=scan.nextDouble();
		
		System.out.println("lutfen kilonuzu kg giriniz");
		double kilo=scan.nextDouble();
		double bmi=(kilo/100*boy/100);
		
		if (bmi<=20) {
			System.out.println("oldukca zayifsiniz");
		}
		else if (20<bmi&& bmi<=25) {
			System.out.println("normal sinirlardasiniz");
		}
		
		else if (25<bmi&& bmi<=30) {
			System.out.println("sisman grubundasiniz");
		}
		
		
	}

}
