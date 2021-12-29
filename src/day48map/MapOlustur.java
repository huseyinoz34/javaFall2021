package day48map;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
	//101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#
	public static Map<Integer,String>myMap(){
		
		Map<Integer,String>ornekMap=new HashMap<>();
		ornekMap.put(101, "Ali, can, java ");
		ornekMap.put(102, "veli, jan, java ");
		ornekMap.put(101, "Ali, yan, C# ");
		return ornekMap;
	}
	
	
	
}
