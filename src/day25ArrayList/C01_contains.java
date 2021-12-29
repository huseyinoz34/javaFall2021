package day25ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// verilen bir arrayde tekrar eden elemenleri sadece 
		// birer tane yazarak unique elemenlerden olusan bir array 
      // haline getirelim
		
		
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,5,9,1,0,3,5};
		//2345678910 haline getirelim
		
		@SuppressWarnings("rawtypes")
		List<Integer>tekrarsiz=new ArrayList<>();
	
		
		for (int i = 0; i < arr.length; i++) {
			
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
			
		}
		System.out.println(tekrarsiz);
		
		@SuppressWarnings("unused")
		int tekrarsizArray[]=new int[tekrarsiz.size()];
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i]=tekrarsiz.get(i);
		}
		System.out.println(Arrays.toString(tekrarsizArray));
	}

}
