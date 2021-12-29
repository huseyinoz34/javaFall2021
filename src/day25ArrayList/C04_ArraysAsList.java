package day25ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"a","b","c","d"};
		List<String> arraydenList=Arrays.asList(arr);
		
		System.out.println();
		// arraydenList.add("f");
		//System.out.println(arraydenList);
		// hata verecek rte arrayi liste cevirince boyutuda 
		// array gibi sabit olacak add ve clear yapamayiz
		// arrayde bi degisiklik olursa list de otomatik degisir
		
		
	}

}
