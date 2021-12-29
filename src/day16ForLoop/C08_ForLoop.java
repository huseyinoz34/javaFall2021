package day16ForLoop;

import java.util.Scanner;

public class C08_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//terview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
		// 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.
		// Ancak;
		//- Sayi 3'un kati ise sayi yerine "Java" yazdirin.
		//- Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
		//- Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin.	 *
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi girinit");
		double num=scan.nextDouble();
		int sayi=(int) num;
		if (num<0) {
			System.out.println("lutfen pozitif bir sayi giriniz");
		} else if (sayi!=num) {
			System.out.println("lutfen tam sayi giriniz");
		} else if (num>100) {
			System.out.println("lutfen 100 den kucuk bir sayi giriniz");
		}else {
			for (int i = 1; i <= num; i++) {
				if (i%3==0&& i%5==0) {
					System.out.println("java güzeldir");
				} else if (i%3==0) {
					System.out.println("java");
				} else if (i%5==0) {
					System.out.println("güyeldir");
				} else {
System.out.println(i);
				} 

				

			}		
		
		
	}
		scan.close();
	}
}
