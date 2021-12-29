package day22DeminstArray;

public class C04_MDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin 
		//carpimini  ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
		
		
		int arr[][]={ {1,2,3,4}, {4,5}, {6} };
		
		int sonuc=1;
		
		for (int i = 0; i < arr[i].length; i++) {
			sonuc*=arr[i].length-1;
		}
		System.out.println(sonuc);
	}

}
