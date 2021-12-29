package day31Dateandtime;

public class C05_VarArgs {

	public static void main(String[] args) {
		// verilen sayilari toplayan bir method olusturalim
		
		int a=10;
	    int b=20;
	    int c=30;
	    int d=40;
	    int e=40;
	    
	    
		topla(a,b);
		
		topla(a,b,c);
		topla(a,b,c,d);
		topla(a,b,c,d,e); //varargs calisir variaty argumans
		
		
	}

	private static void topla(int...a) {
		// TODO Auto-generated method stub
		
	}

	private static void topla(int a, int b, int c) {
		System.out.println("iki sayinin toplami   :");
		
	}

	private static void topla(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
