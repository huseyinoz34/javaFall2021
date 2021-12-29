package practise1;

import java.util.Scanner;

public class C04_soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str=scan.nextLine();
		
		if (str.length()%2==0) {
			System.out.println("girilen stringin ilk yarisi  :"+str.substring(0,str.length()/2));
		}else {
			System.out.println("tek uzunlukta string girilmis");
			scan.close();
		}

	}

}
