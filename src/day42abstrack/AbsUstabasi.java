package day42abstrack;

public class AbsUstabasi  extends AbsIsci{

	public static void main(String[] args) {
		
AbsUstabasi absust1=new AbsUstabasi();
absust1.maaas();
absust1.statu();
absust1.mesai();

	}

	@Override
	public void mesai() {
		System.out.println("ustabasi ariza durumunda cozulunceye kadar calisir");

		
	}

	@Override
	public void maaas() {
		System.out.println("ustabasilar aylik 10000 maas alir");

		
	}

	@Override
	public void statu() {
		System.out.println("bu classdaki herkes ustabasi olmali imza usta");

		
	}

}
