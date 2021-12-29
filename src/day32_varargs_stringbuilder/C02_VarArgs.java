package day32_varargs_stringbuilder;

public class C02_VarArgs {

	public static void main(String[] args) {
		topla (5,8,10,12);
		// ne kadar argument eklersek ekleyelim
		// problem olmaz

	}

	private static void topla(int... sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("girilen sayilarin toplami :"+toplam);
	}

}
