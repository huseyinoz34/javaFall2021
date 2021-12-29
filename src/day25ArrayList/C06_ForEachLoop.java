package day25ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index le hic ugrasmadan bir array veya listediki
		//elemanlari gözden gecirmek isteriz
		
		
		int arr[]= {1,2,3,5,3,2,7,};
		List<Integer> yeniList=new ArrayList<>();
		
		
		
		
		for (int each :arr) {  //arr deki herbir each int i bana getiri
			yeniList.add(each);
		}
System.out.println(yeniList);
	}

}
