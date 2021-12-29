package day38_overridding;

public class Baliklar extends animals{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Baliklar balik1 =new Baliklar();
balik1.beslenme();// animals ve burda ayni method olmasina ragmen kendi clasindaki method calisir
balik1.hareket();
balik1.solunum(); 
// over riding in amaci parent classdaki methodu etkisiz hale getirmek
	}
	@Override// child clasdaki bir method parent clasdan bir methodu override ediyorsa @Override ile deklare ederz
	public void hareket() {
		System.out.println("baliklar yüzerek hareket eder");
		
	}
	
	public void solunum() {
		System.out.println("baliklar solungaclariyla solunum yapar");
	}
}
