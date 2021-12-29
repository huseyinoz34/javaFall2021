package day17NestedVorLoop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {
		// kullanicidan 10 dan kucuk pozitif bir tam sayi isteyin
		// girdigi sayiya gore orn 3 girilirse
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("luttfen ondan kucuk bir pozirif tam sayi girin");
		int num1 = scan.nextInt();

		for (int satir = 1; satir <= num1; satir++) {

			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");
			}

			System.out.println("");

		}
scan.close();
	}

}
