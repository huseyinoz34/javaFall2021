package day28_constructor;

public class C02 {

	int x =5;
	
	static int y=10;
	
	
	
	
	public static void main(String[] args) {
		// 3 tane obje olusturalim degisimleri gorelim
		
		
		C02 obje1=new C02();
		System.out.println("obje1 icin x  :"+obje1.x+ " obje1 icin  y :"+ C02.y);
        obje1.x++;
        C02.y++;
        System.out.println(" islemden sonra obje1 icin x  :"+obje1.x+ " obje1 icin  y :"+ C02.y); 
        
        C02 obje2=new C02();
        System.out.println("obje2 icin x  :"+obje2.x+ " obje1 icin  y :"+ C02.y);
        // y static oldugu icin degisimler herkes icin gecerli
	}

}
