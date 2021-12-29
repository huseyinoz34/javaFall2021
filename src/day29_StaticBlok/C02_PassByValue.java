package day29_StaticBlok;

public class C02_PassByValue {

	public static void main(String[] args) {
		// biz 100 tl ye satilan bir urun icin 2 farkli indirim 
		// yapalim
		
		int fiyat=100;
		indirimYap( fiyat);
		System.out.println("method dan son sonraki fiyat :"+fiyat);
		//yukarida 75 degil 100 yazdirir

	}

	private static void indirimYap(int fiyat) {
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat  :"+fiyat);
		
	}

}
