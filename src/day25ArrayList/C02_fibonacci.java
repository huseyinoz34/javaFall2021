package day25ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacci {

	public static void main(String[] args) {
		// 1000den kucuk fibinacci sayilarini bir list olarak
		//kaydedelim
		
		int sinir =100;
		List<Integer>fibonacci=new ArrayList<>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayi=0;
		while(sayi<sinir) {
			
			sayi=fibonacci.get(fibonacci.size()-1)+ fibonacci.get(fibonacci.size()-2);
			fibonacci.add(sayi);
		}
		
		
		fibonacci.remove(fibonacci.size()-1);
		System.out.println(fibonacci);
	}

}
