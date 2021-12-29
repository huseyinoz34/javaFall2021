package day25ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> isimler=new ArrayList<>();
		isimler.add("huseyin");
		isimler.add("ehmet");
		isimler.add("mustafa");
		Collections.sort(isimler);
		System.out.println(isimler);
	}

}
