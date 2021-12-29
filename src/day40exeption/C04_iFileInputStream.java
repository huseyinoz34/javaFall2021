package day40exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_iFileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// java da bir dosyaya ulasmak icin fileinputstreamdan yardim alabilirz

		
		FileInputStream fis =new FileInputStream("src\\day40exeption\\yazi.txt");
	// java bu kodda olasi bir problem goruyor her alti cizilen cte degildir
		// bunun iki cozumu var 
		//1 try catch
		// eger dosya okunamiyorsa kod calismasin ve sorumlulugun bizde okdugunu javaya soylemeliyi
	
	
	System.out.println("gorev tamamandi");
	}

}
