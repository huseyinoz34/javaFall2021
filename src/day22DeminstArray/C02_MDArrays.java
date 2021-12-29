package day22DeminstArray;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// multidimensional Array ler ic ice konulmus arraylaer demektir
		
		int arr[][]=new int [3][2];
		
		System.out.println(Arrays.toString(arr));
		// direk outer arrayi yazdirmak istedigimizde icindeki 
		// non primitive oldugundan referansi yazdirilir
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.deepToString(arr));
		arr[0][1]=5;
		arr[1][0]=2;
		System.out.println(Arrays.deepToString(arr));
		
		
		int arr2[][]= { {0},{1,2,3},{6,7,8,9}};
		System.out.println(Arrays.toString(arr2[1]));
		System.out.println(Arrays.deepToString(arr2));
		System.out.println(arr2[2][1]);
		
		
	}

}