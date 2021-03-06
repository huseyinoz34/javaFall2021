package day21;

import java.util.Arrays;

public class C01Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String isimler[] = { "Hacer", "ainagul", "Emine", "Murat", "Kutlu"};
        
        // isimler array'inde Murat ismi var mi ?
        
        // array'de arama yapmadan once siralama yapmaliyiz
        
        Arrays.sort(isimler);
        // arrayss class'i ile sort yaptigimizda array'imiz kalici olarak degisir
        
        System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, ainagul]
        // sort method'u elementleri natural order'a gore siralar
        
        isimler[4]="Ainagul";
        System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, Ainagul]
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));// [Ainagul, Emine, Hacer, Kutlu, Murat]
        
        System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4
        
        System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5
        System.out.println(Arrays.binarySearch(isimler, "Tuba")); // -6
        System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4
		
		
		

	}

}
