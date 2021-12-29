package day40exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_ParentChildException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis =new FileInputStream("src\\day40exeption\\yazi.txt");
		}catch (FileNotFoundException e) {
			
		}
		System.out.println("gorev tamamlandi");
	}

}
