package day40exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Ecception {

	public static void main(String[] args) {
		// verilen bir int array icin kullanicidan bir sayi isteyin 
		// girilen sayiyi index kabul edip o indexdeki elementi yazdirin
  // kullanici burda eksi veya olmayan bir index girerse exception verir
		int arr[]= {2,3,5,6,2,7,9,1,};
		try {
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen yazdirmak icin index giriniz");
		int index=scan.nextInt();
		System.out.println(arr[index]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginiz index arreyde yok");
		}catch (InputMismatchException e) {
			System.out.println("pozitif bir tam sayi giriniz");
		}
		
		
	}

}
