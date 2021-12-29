package day18;

import java.util.Scanner;

public class C01WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
System.out.println("lutfen bolenlerini bulmak icin bir tam sayi girin");

int sayi=scan.nextInt();

int sayac=0;
int bolen=1;
while (bolen<=sayi) {
	if (sayi%bolen==0) {
		System.out.print(bolen+ " ");
		sayac++;
	}
	bolen++;
}
System.out.println("");
System.out.println(sayi+  " sayisinin "+sayac+ " adet tam boleni vardir");
scan.close();
	}

}
