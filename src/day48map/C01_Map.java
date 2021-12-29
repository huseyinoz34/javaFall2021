package day48map;

import java.util.HashMap;
import java.util.Map;

public class C01_Map {

	public static void main(String[] args) {
		// verilen bir stringe harfleri ve harflerin kacar kez kullanildigini gosteren
		// bir method olustrurun
		
		String input="Hellooo";
		
		Map<String,Integer>mainMap=harfsay (input);
		System.out.println(mainMap);

	}

	private static Map<String,Integer> harfsay(String input) {
		// TODO Auto-generated method stu
		
		Map<String,Integer> harfsayilariMap=new HashMap<>();
		String inputArr[]=input.split("");
		for (String each : inputArr) {
			
			if (!harfsayilariMap.containsKey(each)) {
				harfsayilariMap.put(each, 1);
			} else {

				harfsayilariMap.put(each,harfsayilariMap.get(each)+1);
				
				
			}
			
		}
		
	return harfsayilariMap;	
	}

}
