package day33stringbuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();

		System.out.println(sb.length());// 0 sb in uzunlugu icinde bi sey yok
		
		System.out.println(sb.capacity());// 16
		
		StringBuilder sb1=new StringBuilder("java candir ");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		StringBuilder sb3=new StringBuilder();
		sb3.append("nilgun");
		System.out.println(sb3.length());
	}

}
