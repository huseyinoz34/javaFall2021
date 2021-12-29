package day25ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listeden icinde belirli bir harf olan belirli 
		//silen bir method yazin
		
		
		List<String> str=new ArrayList<>();
		str.add("ali");
		str.add("veli");
		str.add("kaan");
		str.add("selma");
		System.out.println(str);
		
	String silinecekHarf="e";
		
		killThemAll(str,silinecekHarf);
		
		System.out.println(str);
		
	}

	private static List<String> killThemAll(List<String> str, String silinecekHarf) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekHarf));{
				str.remove(i);
				i--;
			}
		}
		System.out.println(str);
		
		
		return str;
	}

}
