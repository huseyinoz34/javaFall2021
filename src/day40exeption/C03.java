package day40exeption;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=0;

System.out.println("gorev tamamlandi");
// java burda exception firlatiyor cunku bir sayi 0 a bolunmez

try {
	System.out.println("sayilarin bolumu  "+a/b);
}catch(ArithmeticException e) {
	System.out.println("0 a bolum yapilamaz");
	//System.out.println(e.getStackTrace());
}
System.out.println("gorev tamamlandi");
	}

}
