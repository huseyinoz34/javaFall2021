package day17NestedVorLoop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//oru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
		
		int sayi=100;
		
		while (sayi<100) {
			if (sayi%15==0&& sayi%20==0 && sayi%90==0) {
				System.out.println(sayi);
			}
			sayi++;
		}
		
	}

}
