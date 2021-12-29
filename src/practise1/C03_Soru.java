package practise1;

public class C03_Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char A=pickName.charAt(pickName.indexOf("A"));
		char L=pickName.charAt(pickName.indexOf("L"));
		char I=pickName.charAt(pickName.indexOf("I"));
		System.out.println("ali  :"+A+L+I);
	}

}
