package day42abstrack;

public class Ustabasi extends Isci {
	public void statu() {
		System.out.println("bu classdaki herkes ustabasi olmali imza usta");
	
	}
	public void maas() {
		System.out.println("ustabasilar aylik 10000 maas alir");
	}
	
	public void mesai() {
		System.out.println("ustabasi ariza durumunda cozulunceye kadar calisir");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ustabasi ust1=new Ustabasi();
		ust1.statu();
		ust1.maas();
		

	}

}
