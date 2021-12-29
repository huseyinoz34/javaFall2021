package day11String_Manipilation;

public class C04_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="calisirsaniz,java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));//4
		
		System.out.println(str.indexOf('J'));//14
		
		int index=str.indexOf("r");
		System.out.println(str.indexOf("q"));// -1 yazdirir

		
		
		
		System.out.println(str.indexOf("va og"));//16 yazdirir
		// aradigimiz charsquence anlamli ve anlamsiz bir kelime olabilir
		
		
		System.out.println(str.indexOf('e',15));// 22 15.kararkteden 
		//sonra aramaya baslar
		
		
	}

}
