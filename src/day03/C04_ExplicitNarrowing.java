package day03;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1=140;
		short sayi2=(short) sayi1;
		
	
		
		System.out.println(sayi2);
	    byte sayi3=(byte) sayi2;
		System.out.println(sayi3);
		
        double sayi4=87.3;
        int sayi5=(int) sayi4;
        System.out.println(sayi5);
        
        int sayi6=27;
        int sayi7=4;
        		System.out.println(sayi6/  sayi7);
        		double sayi8=4;
        		System.out.println(sayi6/sayi8);
        		double sayi9=17;
        		System.out.println(sayi9/sayi7);
        
        
        
        
	}

}
