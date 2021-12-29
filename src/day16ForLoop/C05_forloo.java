package day16ForLoop;

import java.util.Scanner;

public class C05_forloo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen
//sayiya kadar 3’un kati olan sayilari yazdirin.
		
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
		if (i%3==0) {
			System.out.print(i+" ");
		}
}




}

	}

}
