package day16ForLoop;

import java.util.Scanner;

public class C09_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//kullanicidan bir string isteyin tersden yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir yazi girin");
       String str =scan.nextLine();
  for (int i = str.length()-1;i>=0; i--) {
	System.out.print(str.substring(i,i+1));
}
  scan.close();
	}

}
