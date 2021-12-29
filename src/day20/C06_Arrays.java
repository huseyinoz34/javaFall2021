package day20;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// verilen bir array in tum elemanlarini toplayan 
		//bir program yazin
int arr[]= {3,5,8,4,5};
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println(toplam);
		// tüm elemanlari kucukten buyuge siralama
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
