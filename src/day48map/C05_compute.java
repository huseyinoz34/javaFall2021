package day48map;

import java.util.HashMap;
import java.util.Map;

public class C05_compute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer>ornek=new HashMap<>();
		
		ornek.put("a", 1);
		ornek.put("B", 5);
		ornek.put("C", 7);
		ornek.put("Z", 10);
		ornek.compute("B", (key,value)->2*value+4);
		System.out.println(ornek);
		
	}

}
