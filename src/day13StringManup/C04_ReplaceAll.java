package day13StringManup;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="+java 98ogrenmek c..ok k876olay";
		
		// replaceall method kullanarak java ögrenmek cok kolaya 
		str=str.replaceAll("\\d", "");
		
		System.out.println(str);
		str=str.replaceAll("\\s", "x");
		str=str.replaceAll("\\W", "");//javaogrenmekcokkolay
		System.out.println(str);
		str=str.replaceAll("x", " ");
		
		System.out.println(str);
	}

}
