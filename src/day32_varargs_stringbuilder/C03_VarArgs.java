package day32_varargs_stringbuilder;

public class C03_VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		topla (5,8,10,12);
		// varargs dan once farkli parametreler kullanilabilir
		// aber nach dem varargs benutzen wir  kein parametre mehr 

	}

	private static void topla(int... sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}	
		
		
	}

}
